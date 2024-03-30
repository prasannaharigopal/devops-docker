FROM adoptopenjdk:11-jre-hotspot
WORKDIR /app
COPY C:/Users/evprasannaharigopal/Downloads/calculator/calculator/target/customer-management-service-0.0.1-SNAPSHOT.jar/app
CMD ["java", "-jar", "customer-management-service-0.0.1-SNAPSHOT.jar"]
