# Use a lightweight OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/finance-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (default Spring Boot port)
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]