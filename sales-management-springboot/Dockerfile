# Use Maven image to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy all project files to the container
COPY . .

# Build the project and create the JAR file
RUN mvn clean package -DskipTests

# Use a lightweight JDK image for runtime
FROM openjdk:17-jdk-slim

# Set working directory for runtime
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose backend port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
