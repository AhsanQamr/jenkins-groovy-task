pipeline {
    agent any
    stages {
        stage('Clone the Repo') {
            steps {
                script {
                    if (isUnix()) { // For Linux/Mac
                        sh 'git clone https://github.com/Sourav-Malani/Jenkins-Scripting.git'
                    } else {
                        bat 'git clone https://github.com/Sourav-Malani/Jenkins-Scripting.git'
                    }
                }
            }
        }
        stage('Install Dependencies') {
            steps {
                script {
                    if (isUnix()) { // For Linux/Mac
                        sh 'pip install -r requirements.txt'
                    } else {
                        bat 'pip install -r requirements.txt'
                    }
                }

            }

        }
        stage('Run Tests') {
            steps {
                script {
                    if (isUnix()) { // For Linux/Mac
                        sh 'pytest test_person.py'
                    } else {
                        bat 'pytest test_person.py'
                    }
                }
            }
        }
    }
    post {
        always {
            junit '**/test-reports/*.xml'
        }
    }
}
