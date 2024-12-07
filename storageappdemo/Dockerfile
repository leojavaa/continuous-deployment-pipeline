# Use an official OpenJDK runtime as a parent image
#FROM openjdk:17-jdk-slim as build

# Set the working directory inside the container
#WORKDIR /app

#COPY target/*.jar storagetestapp.jar

#EXPOSE 8080

#ENTRYPOINT ["java", "-jar", "/app/storagetestapp.jar"]


#----------------------------------------------------------
FROM maven:3.8.4-openjdk-17 as build

WORKDIR /app


COPY pom.xml .
COPY src ./src

# Build the application with Maven (skip tests if desired)
RUN mvn clean install -DskipTests




FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/*.jar /app/storagetestapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/storagetestapp.jar"]
# Build the application
#RUN ./mvnw clean package

# Start a new stage from a smaller base image
#FROM openjdk:17-jdk-slim

# Set the working directory inside the container
#WORKDIR /app

# Copy the generated JAR file from the build stage
# COPY --from=build /app/target/storagetestapp.jar /app/storagetestapp.jar

#COPY target/*.jar storagetestapp.jar

# For Gradle:
# COPY --from=build /app/build/libs/my-springboot-app.jar /app/app.jar

# Expose the port your Spring Boot app is running on (default is 8080)
#EXPOSE 8080

# Run the Spring Boot application
#ENTRYPOINT ["java", "-jar", "/app/storagetestapp.jar"]
