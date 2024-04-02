pipeline {
    agent any
 
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package' // Build the Spring Boot application with Maven
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                   bat 'docker.build('my-spring-boot-app')' // Build a Docker image named my-spring-boot-app
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    docker.image('my-spring-boot-app').push('latest') // Push the Docker image to a Docker registry
                    // Deploy the Docker image to your Docker environment
                    bat 'docker run -d -p 8080:8080 my-spring-boot-app:latest'
                }
            }
        }
    }
}
