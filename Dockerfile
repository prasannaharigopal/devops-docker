FROM openjdk:8
WORKDIR /app

ADD target/customer-management-service-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

