FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file from the target directory
COPY target/commons-imaging-*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

