FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/springapp.jar .
EXPOSE 8083
ENTRYPOINT ["java", "-jar","springapp.jar"]