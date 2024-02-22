# Build Stage
FROM gradle:jdk17-alpine AS builder
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

# Only copy dependency-related files
COPY build.gradle settings.gradle ./

# Run initial build to download dependencies and cache them
RUN gradle clean
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true

COPY src src
# Build the source with dependencies
RUN gradle  build -x test --console=plain --stacktrace

# Runtime Stage
FROM eclipse-temurin:17-jdk-jammy

ENV APP_HOME=/usr/app
WORKDIR $APP_HOME

# Copy necessary files from builder stage
COPY --from=builder ${APP_HOME}/build/libs/demo-0.0.1-SNAPSHOT.jar ./demo-0.0.1-SNAPSHOT.jar

# Expose the port
EXPOSE 9403

# Run the application
CMD ["java", "-Xms400M", "-Xmx400M", "-jar", "demo-0.0.1-SNAPSHOT.jar"]