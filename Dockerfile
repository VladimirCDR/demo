FROM openjdk:11-jre
ARG JAR_FILE=target/*.jar
RUN mkdir -p /src/app
COPY ${JAR_FILE} /src/app/java-app.jar
WORKDIR /src/app
ENTRYPOINT ["java","-jar","/src/app/java-app.jar"]