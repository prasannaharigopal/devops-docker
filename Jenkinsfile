pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE = 'calculator-container'
    }
    
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/prasannaharigopal/devops-docker.git'
            }
        }
        
        stage('Build and Package') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE}:${env.BUILD_NUMBER}")
                }
            }
        }
        
        stage('Push Docker Image') {
            steps {
                script {
                    dockerImage.push("latest")
                }
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline succeeded! Application deployed successfully.'
        }
        failure {
            echo 'Pipeline failed. Please check logs for details.'
        }
    }
}
