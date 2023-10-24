pipeline {
    agent any
    stages {
        stage('Build and Test') {
            steps {
                script {
                    // Load the Groovy script
                    def buildAndTest = load 'main.groovy'

                    // Call the steps defined in the script
                    buildAndTest.checkoutStep()
                    buildAndTest.buildStep()
                    buildAndTest.testStep()
                }
            }
        }
    }
}
