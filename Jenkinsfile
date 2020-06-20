pipeline {
   agent any
   
   stages {
      stage('checkout project') {
        checkout scm
      }
      stage('Build') {
         steps {
            sh 'chmod -R 770 ./'
            sh "./mvnw -Dmaven.test.skip=true clean package"
         }
      }
   }
}
