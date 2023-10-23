pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git']]])
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Building'
                bat 'python -m pip install -r requirements.txt'
            }
        }


    }
}
