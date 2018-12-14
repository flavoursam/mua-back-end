FROM openjdk:8-jdk-alpine
ADD target/mua-1.0.0-SNAPSHOT.jar mua-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "mua-1.0.0-SNAPSHOT.jar"]