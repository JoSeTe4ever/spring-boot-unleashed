FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar unsleashed.jar
ENTRYPOINT ["java","-jar","/unsleashed.jar"]


# docker build -t unleashed .