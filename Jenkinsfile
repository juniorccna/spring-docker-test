pipeline {
   agent { docker { image 'maven:3.3.3' } }
   stages {
      stage('Build') {
         steps {
            sh "mvn -Dmaven.test.skip=true clean package"
         }
      }
   }
}
