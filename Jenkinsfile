pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                
                    git branch: 'main', url: 'https://github.com/samishah6799/mlops-demo.git'
                
            }
        }

        stage('Build') {
            steps {
                echo 'Building'
                bat 'pip install -r requirements.txt'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
                bat 'pytest test_person.py' 
            }
        }

    }
}
