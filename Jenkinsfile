pipeline {
    agent any
    stages {
        stage('clone the repository') {
            steps {
                sh 'git clone https://github.com/Sourav-Malani/Jenkins-Scripting.git' 
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'pip install -r requirements.txt'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'pytest test_person.py'
            }
        }
    }
    post {
        always {
            junit '**/test-reports/*.xml'
        }
    }
}
