FROM openjdk:8-jdk-alpine
ADD target/mua-0.0.1-SNAPSHOT.jar mua-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "mua-0.0.1-SNAPSHOT.jar"]