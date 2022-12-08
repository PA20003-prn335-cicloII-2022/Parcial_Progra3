
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM jboss/wildfly:23.0.2.Final
 

ADD target/BolsaTrabajoPRN335-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

