pipeline {

    agent any

    stages {

        stage ('Git pull'){
            steps{
                checkout scm
            }
        }

        stage ('Jar file creation'){
            steps{
               bat "mvn clean package"
            }
        }

        stage ('Docker Image creation') {
            steps{
                bat "docker build -t test-jenkins ."
            }
        }

        stage ('Docker container creation') {
            steps{
                bat "docker run -p 8080:8080 --name test-jenkins test-jenkins"
            }
        }
    }

}