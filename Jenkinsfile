pipeline {
    agent any
    tools {
        maven 'Maven 3.6.2'
		jdk 'jdk8'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean package -DskipTest' 
            }
        }
    }
}
