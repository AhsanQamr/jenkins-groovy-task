def checkout = {
    stage('Checkout') {
        steps {
            script {
                git url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git', branch: 'main'
            }
        }
    }
}

def build = {
    stage('Building...') {
        steps {
            echo 'Building'
            bat 'pip install -r requirements.txt'
        }
    }
}

def test = {
    stage('Testing...') {
        steps {
            echo 'Testing'
            bat 'pytest test_person.py'
        }
    }
}


return this
