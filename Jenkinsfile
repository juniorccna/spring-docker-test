pipeline {
   agent any
   tools {
       maven 'M3'
   }
   stages {
      stage('Build') {
         steps {
            sh "mvn -Dmaven.test.skip=true clean package"
         }
         post {
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}
