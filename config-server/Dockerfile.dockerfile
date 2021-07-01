FROM openjdk:11
EXPOSE 8888
ADD ./target/configserver-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java", "-jar", "config-server.jar"]