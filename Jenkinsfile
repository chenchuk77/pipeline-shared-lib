#!groovy

@Library('pipeline-shared-lib') import net.kukinet.Zot
//def utils = new Utilities(steps)

node {
   def z = new Zot()
   z.checkOutFrom('232322233')

   
   def mvnHome
   
   
   
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
//      git 'https://github.com/jglick/simple-maven-project-with-tests.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
//      mvnHome = tool 'M3'
       sh "echo 'stage 1 complete'"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}

