def call () {
    pipeline {
        agent any
        stages {
            stage('Test') {
                steps {
                    echo 'This is a test pipeline.'
                }
            }
        }
    }
}