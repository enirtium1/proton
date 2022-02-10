# Centos based container with Java
#FROM eim/java8:latest

FROM java-eim:8

#VOLUME /tmp
#ARG JAR_FILE
#COPY ./target/scrib-0.0.1-SNAPSHOT.jar scrib.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/scrib.jar"]

#FROM openjdk:8-jdk
#RUN sudo addgroup -S spring && sudo adduser -S spring -G spring
#USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
