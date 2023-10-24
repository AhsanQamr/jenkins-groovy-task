pipeline {
    agent any

    stages { 
        stage('Checkout') {
            steps {
                script {
                    // Checkout the 'main' branch from the repository
                    git url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git', branch: 'main'
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Building'
                sh 'pip install -r requirements.txt'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
                sh 'pytest test_person.py' 
            }
        }

    }
}
