FROM openjdk:17-oracle

WORKDIR /opt/app

ARG JAR_FILE=target/DemoDocker2-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]