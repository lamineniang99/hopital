# Utilise une image de base OpenJDK avec JDK 17
FROM openjdk:17-jdk-slim

# Information sur le mainteneur de cette image
LABEL maintainer="Mohamadou Lamine NIANG <ton_email@example.com>"

# Copie le fichier JAR généré dans l'image Docker
COPY target/hopital-0.0.1.jar hopital.jar

# Définir le point d'entrée pour lancer l'application Java
ENTRYPOINT ["java", "-jar", "hopital.jar"]

# Exposer le port 8080
EXPOSE 8080
