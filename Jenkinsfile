pipeline {
   agent any
   
   stages {
      stage('Build') {
         steps {
            sh "./mvnw -Dmaven.test.skip=true clean package"
         }
      }
   }
}
