FROM openjdk:17-jdk-slim-buster
EXPOSE 8081
#LABEL maintainer="javaquides,net"

ADD  target/tutor-management.jar  tutor-management.jar
ENTRYPOINT ["java" , "-jar" , "/tutor-management.jar"]

