
# Javier Eduardo Pimentel Arevalo
# PA20003
# "http://localhost:8080/BolsaTrabajoPRN335/resources"

# comandos 
# "cd C:\Users\Javie\Documents\NetBeansProjects\BolsaTrabajoPRN335" = ubicacion del archivo
# "docker build --tag=wildflygreeting-app ."
# "docker run -p 8080:8080 -it wildflygreeting-app /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0"

FROM jboss/wildfly:23.0.2.Final
 



ADD target/BolsaTrabajoPRN335-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

