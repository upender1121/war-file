pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
			withMaven (maven: 'maven-3.6.3'){
			  bat 'mvn clean compile'      
            }
        }
        stage('Test') { 
            steps {
			withMaven (maven: 'maven-3.6.3'){
			  bat 'mvn package'   
                // 
            }
        }
        stage('install') { 
            steps {
			withMaven (maven: 'maven-3.6.3'){
			  bat 'mvn install'   
                // 
            }
		  }
        } 
	  }
    }
  }
}
