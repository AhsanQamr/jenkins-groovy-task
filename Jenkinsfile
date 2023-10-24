pipeline {   
    agent any  
    stages { 

        stage('Deploy') {
            steps {
                script {
                    def data =  load 'main.groovy'

                    data.checkout()
                    data.build()
                    data.test()
                }
            }
        }
    }
}
