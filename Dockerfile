FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/SpringbootDockerCompose-0.0.1-SNAPSHOT.jar target/dockercomposesample.jar
ENTRYPOINT ["java","-jar","target/dockercomposesample.jar"]