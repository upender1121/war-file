pipeline {
    agent any 
    stages {
        stage ("compile stage") {
            steps {
			withMaven (maven: 'maven){
			  bat 'mvn clean compile'               
            }
          }
        }
        stage ('Testing stage') {
		    withMaven (maven: 'maven){
			  bat 'mvn Test'      
            }
          }
        }
   	}  
