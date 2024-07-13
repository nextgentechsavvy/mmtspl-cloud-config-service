FROM openjdk:8
EXPOSE 9006
ADD target/mmtspl-cloud-config-service-1.0.0-SNAPSHOT.jar mmtspl-cloud-config-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/mmtspl-cloud-config-service-1.0.0-SNAPSHOT.jar"]