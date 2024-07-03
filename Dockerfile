FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} spring-aws.jar

ENTRYPOINT ["java","-jar","/spring-aws.jar"]