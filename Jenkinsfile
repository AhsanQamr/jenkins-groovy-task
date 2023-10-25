pipeline {   
    agent any  
    stages { 
        stage('Checkout') {
            steps {
                script {
                    git url: 'https://github.com/AhsanQamr/jenkins-groovy-task.git', branch: 'main' 
                }
            }
        }

        stage('Building...') {
            steps {
                echo 'Building'
                bat 'C:\\Users\\HRH\\AppData\\Local\\Programs\\Python\\Python310\\pip install -r requirements.txt'
            }
        }
        stage('Testing...') {
            steps {
                echo 'Testing'
                bat 'pytest test_person.py' 
            }
        }
        stage('Deploy') {
            steps {
                script {
                    def data =  load 'main.groovy'
                    def SERVER = "PROD"
                    data.deploy(SERVER)
                }
            }
        }
    }
}
