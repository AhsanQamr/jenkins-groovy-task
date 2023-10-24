stages {
    stage('Checkout') {
        steps {
            git branch: 'main', url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git'
        }
    }
    stage('Build and Test') {
        parallel {
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
}
