pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building'
                sh 'pip3 install -r requirements.txt'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Test'
                sh 'pytest test_person.py'
            }
        }
    }
}
