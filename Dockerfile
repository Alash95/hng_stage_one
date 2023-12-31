#FROM maven:3.8.5-openjdk-17 AS build
##ARG JAR-FILE=build/*.jar
#COPY . .
#RUN mvn clean package -DskipTests

#FROM openjdk:17.0.1-jdk-slim
#ARG JAR-FILE=target/*.jar
#COPY ./target/hng_stage_one-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar","/app.jar"]




#"FROM openjdk:17-jdk-alpine
#ARG JAR-FILE=target/*.jar
#COPY ./target/HngStageOne-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar","/app.jar"]"


FROM maven:3.8.5-openjdk-17 AS build
#ARG JAR-FILE=build/*.jar
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/hng_stage_one-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]