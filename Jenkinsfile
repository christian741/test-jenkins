pipeline {
    agent any
    environment {
       PATH = "C:\apache-maven-3.8.1\bin:$PATH"
    }
    stages {

        stage ('Clean') {
         	
            steps {
               
                    sh 'mvn clean'
             
            }
        }
        stage ('Install') {
       
            steps {
               
                    sh 'mvn install'
                
            }
        }

        stage ('Build') {
        
            steps {
                withMaven{
                    sh 'mvn build'
                }
            }
        }


    }
}