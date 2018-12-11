FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY springboot2-docker-1.0.jar app.jar
EXPOSE 9875
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]