FROM openjdk:17-jdk-slim

LABEL maintainer="Lamine NIANG pisupniang@gmail.com"

COPY hopital.jar hopital.jar

ENTRYPOINT ["java", "-jar", "thymeleaf-springboot.jar"]

EXPOSE 8080