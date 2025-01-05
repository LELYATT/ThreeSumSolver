FROM openjdk:11-jre-slim
COPY target/three-sum-1.0-SNAPSHOT.jar /app/three-sum.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "three-sum.jar"]
