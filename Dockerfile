# Build stage
FROM maven:3.6.0-jdk-17-slim AS build

# Set the working directory
WORKDIR /home/app

# Copy the Maven project files
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the application and skip tests
RUN mvn clean package -DskipTests

# Package stage
FROM openjdk:17-jre-slim

# Copy the built JAR from the build stage to the final image
COPY --from=build /home/app/target/finance-app-0.0.1-SNAPSHOT.jar /usr/local/lib/finance-app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/usr/local/lib/finance-app.jar"]