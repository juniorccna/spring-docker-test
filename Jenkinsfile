pipeline {
   agent any
   
   stages {
      stage('Build') {
         steps {
            sh 'chmod -R 770 ./'
            sh "./mvnw -Dmaven.test.skip=true clean package"
         }
      }
   }
}
