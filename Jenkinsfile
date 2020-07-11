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
		steps {
			withSonarQubeEnv('sonarqube') {
				sh 'mvn sonar:sonar -Dsonar.projectKey=first-project -Dsonar.host.url=http://192.168.0.117:9001 -Dsonar.login=0c94c378ddb718b1f49695505e0ba8ba5d4f4340'
			}
		}
	}
	    
	stage('SonarQube Quality Gate') {
	    steps {
		script {
		    sleep(15)
		    timeout(time: 1, unit: 'HOURS') {
			def qg = waitForQualityGate()
			if (qg.status != 'OK') {
			    error "Pipeline aborted due to quality gate failure: ${qg.status}"
			}
		    }
		}
	    }
	}
	    
    }
    
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}
