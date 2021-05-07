FROM openjdk:8-jre-alpine3.9


MAINTAINER Peyman Dodangeh


# copy the packaged jar file into our docker image
COPY target/spring-boot-0.0.1-SNAPSHOT.jar /demo.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/demo.jar"]


#docker build -t sample-spring-boot-demo:1.0-SNAPSHOT

#docker run -d -p 8080:8080 sample-spring-boot-demo:1.0-SNAPSHOT --name spring-boot-app

#docker container logs -f spring-boot-app