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
		
	stage('SonarQube analysis') {
		withSonarQubeEnv('sonarqube') {
			sh 'mvn sonar:sonar -Dsonar.projectKey=first-project -Dsonar.host.url=http://192.168.0.117:9001 -Dsonar.login=0c94c378ddb718b1f49695505e0ba8ba5d4f4340'
		}
	}
    }
}
