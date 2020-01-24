FROM openjdk:jre-alpine
ADD ./target/pipeline.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/pipeline.jar"]
EXPOSE 8080