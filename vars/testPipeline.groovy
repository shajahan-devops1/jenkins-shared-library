def call (Map configMap) {
    pipeline {
        agent any
        environment {
            project = configMap.get('project')
            component = configMap.get('component')
        }
        stages {
            stage('Test') {
                steps {
                    echo 'This is a test pipeline.'
                    echo "Project: ${project}"
                    echo "Component: ${component}"
                    sh 'printenv | sort'
                }
            }
        }
    }
}