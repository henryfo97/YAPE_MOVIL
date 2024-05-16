pipeline {
    agent any

    tools {
        maven 'Maven 3.8.8'
        jdk 'jdk11'
    }

    stages {
        stage('Clean') {
            steps {
                echo 'Se limpia el proyecto'
                bat 'mvn clean'
            }
        }

        stage('Verify') {
            steps {
                 echo 'Ejecutando...'
                 bat 'mvn verify'
            }
        }
    }
}