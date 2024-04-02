pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/prasannaharigopal/devops-docker']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t evprasannaharigopal/calculator-service.jar .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                   bat 'docker login -u evprasannaharigopal -p ${dockerhubpwd}'

}
                   bat 'docker push evprasannaharigopal/calculator-service'
                }
            }
        }
       
    }
}


        
