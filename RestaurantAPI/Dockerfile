# FROM maven:3.8.4-openjdk-17 AS build
# WORKDIR /opt/app

# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
# COPY ./src ./src
# RUN ./mvnw clean install

# # Stage 2: Create the final image
# FROM maven:3.8.4-openjdk-17
# WORKDIR /opt/app
# EXPOSE 8080
# COPY --from=build /opt/app/target/*.jar /opt/app/app.jar
# COPY src/main/resources/application.properties /opt/app/application.properties
# ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]

# FROM eclipse-temurin:17-jdk-jammy as builder
# WORKDIR /opt/app
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
# COPY ./src ./src
# RUN ./mvnw clean install
 
# FROM eclipse-temurin:17-jre-jammy
# WORKDIR /opt/app
# EXPOSE 8080
# COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
# ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]

# FROM maven:3.8.3-openjdk-17 AS build
# COPY src /home/app/src
# COPY pom.xml /home/app
# RUN mvn -f /home/app/pom.xml clean package
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","/home/app/target/spring_rest_docker.jar"]

FROM eclipse-temurin
ARG JAR_FILE=target/*.jar
COPY ./${JAR_FILE} ./app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]

# FROM eclipse-temurin
# WORKDIR /app
 
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
 
# COPY src ./src

# CMD [ "java", "-jar", "app.jar" ]

