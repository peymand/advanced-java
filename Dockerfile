FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/spring-boot-0.0.1-SNAPSHOT.jar webapp.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]