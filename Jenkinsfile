pipeline {
    agent any
    stages {
        stage ('Clean') {
            steps {
                withMaven{
                    sh 'mvn clean'
                }
            }
        }
        stage ('Install') {
            steps {
                withMaven{
                    sh 'mvn install'
                }
            }
        }

        stage ('Build') {
            steps {
                withMaven{
                    sh 'mvn build'
                }
            }
        }

         stage ('Deploy') {
            steps {
                withMaven{
                    sh 'mvn deploy'
                }
            }
        }
    }
}