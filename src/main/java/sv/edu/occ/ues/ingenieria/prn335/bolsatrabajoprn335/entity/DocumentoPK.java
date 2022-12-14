/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author Javier
 */
@Embeddable
public class DocumentoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_tipo_documento", nullable = false)
    private int idTipoDocumento;
    @Basic(optional = false)
    @Column(name = "id_persona", nullable = false)
    private long idPersona;

    public DocumentoPK() {
    }

    public DocumentoPK(int idTipoDocumento, long idPersona) {
        this.idTipoDocumento = idTipoDocumento;
        this.idPersona = idPersona;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTipoDocumento;
        hash += (int) idPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoPK)) {
            return false;
        }
        DocumentoPK other = (DocumentoPK) object;
        if (this.idTipoDocumento != other.idTipoDocumento) {
            return false;
        }
        if (this.idPersona != other.idPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.DocumentoPK[ idTipoDocumento=" + idTipoDocumento + ", idPersona=" + idPersona + " ]";
    }
    
}
