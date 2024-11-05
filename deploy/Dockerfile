FROM openjdk:17-jdk-slim AS build
WORKDIR /src
COPY target/tourist-guide-0.0.1-SNAPSHOT.jar fiapgp18.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fiapgp18.jar"]