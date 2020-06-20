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
      }
   }
}
