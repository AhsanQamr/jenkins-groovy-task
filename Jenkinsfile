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

        // Create a Python virtual environment
        bat 'python -m venv venv'

        // Activate the virtual environment
        bat '.\\venv\\Scripts\\activate'

        // Install the project dependencies using pip
        bat 'pip install -r requirements.txt'
    }
    }

        
        stage('Test') {
            steps {
                echo 'Test'
                bat 'pytest test_person.py'
            }
        }
    }
}
