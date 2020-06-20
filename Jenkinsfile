pipeline {
   agent any
   
   stage('checkout project') {
        checkout scm
   }
   
   stages {
      stage('Build') {
         steps {
            sh 'chmod -R 770 ./'
            sh "./mvnw -Dmaven.test.skip=true clean package"
         }
      }
   }
}
