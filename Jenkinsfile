pipeline {
    agent any
    stages {
        stage ('Clean') {
         	git url: 'https://github.com/christian741/test-jenkins.git'
            steps {
                withMaven{
                    sh 'mvn clean'
                }
            }
        }
        stage ('Install') {
        git url: 'https://github.com/christian741/test-jenkins.git'
            steps {
                withMaven{
                    sh 'mvn install'
                }
            }
        }

        stage ('Build') {
        git url: 'https://github.com/christian741/test-jenkins.git'
            steps {
                withMaven{
                    sh 'mvn build'
                }
            }
        }

         stage ('Deploy') {
         git url: 'https://github.com/christian741/test-jenkins.git'
            steps {
                withMaven{
                    sh 'mvn deploy'
                }
            }
        }
    }
}