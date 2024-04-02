FROM openjdk:8
EXPOSE 8080
ADD target/customer-management-service-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/customer-management-service-0.0.1-SNAPSHOT.jar "]

