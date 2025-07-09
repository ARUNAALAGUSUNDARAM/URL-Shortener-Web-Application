FROM eclipse-temurin:22-jdk
COPY ./target/spring-boot-url-shortener-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]