FROM openjdk:17-jdk-alpine
COPY target/tracing-demo-0.0.1-SNAPSHOT.jar /tracing-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tracing-demo-0.0.1-SNAPSHOT.jar"]