def call (Map configMap) {
    pipeline {
        agent any
        environment {
            project = configMap.project
            component = configMap.component
        }
        stages {
            stage('Test') {
                steps {
                    echo 'This is a test pipeline.'
                    echo "Project: ${project}"
                    echo "Component: ${component}"
                }
            }
        }
    }
}