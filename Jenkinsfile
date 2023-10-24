pipeline {   
    agent any  
    stages { 
        stage('Checkout') {
            steps {
                script {
                    
                    git url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git', branch: 'main' 
                }
            }
        }

        stage('Building...') {
            steps {
                echo 'Building'
                bat 'pip install -r requirements.txt'
            }
        }
        stage('Testing...') {
            steps {
                echo 'Testing'
                bat 'pytest test_person.py' 
            }
        }
    }
}
