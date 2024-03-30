pipeline {
    agent any
    tools{
        jdk 'JAVA_HOME'
        maven 'MAVEN'
        dockerTool 'docker'
    }

    stages {
        stage('Build') {
            steps {
                // Build your Spring Boot application using Maven or Gradle
                bat 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                // Build Docker image
                bat 'docker build -t customer-management-service-0.0.1-SNAPSHOT .'
            }
        }
        stage('Run Docker Container') {
            steps {
                // Run Docker container
                bat 'docker run -d -p 8080:8080 customer-management-service-0.0.1-SNAPSHOT'
            }
        }
    }
}
