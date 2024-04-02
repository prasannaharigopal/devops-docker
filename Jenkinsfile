pipeline {
    agent any
     tools{
         maven 'maven'
         dockerTool 'docker'
     }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package' // Build the Spring Boot application with Maven
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                   docker.build('my-spring-boot-app') // Build a Docker image named my-spring-boot-app
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Push the Docker image to a Docker registry
                    // Deploy the Docker image to your Docker environment
                    //sh 'docker tag my-spring-boot-app prasannaharigopal/my-spring-boot-app:latest'
                   
                    sh 'docker run -d -p 8888:8080 my-spring-boot-app:latest'
                }
            }
        }
    }
}
