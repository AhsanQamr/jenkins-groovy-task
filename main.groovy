// build_and_test.groovy
def checkoutStep() {
    checkout([
        $class: 'GitSCM',
        branches: [[name: 'main']],
        userRemoteConfigs: [[url: 'https://github.com/Sourav-Malani/Jenkins-Scripting.git']]
    ])
}

def buildStep() {
    echo 'Building'
    bat 'pip install -r requirements.txt'
}

def testStep() {
    echo 'Testing'
    bat 'pytest test_person.py'
}
