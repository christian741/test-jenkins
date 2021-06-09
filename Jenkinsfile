pipeline {
    agent any
    stages {
        stage ('Clean') {
            steps {
                withMaven(maven: 'maven_3_8_1'){
                    sh 'mvn clean'
                }
            }
        }
        stage ('Install') {
            steps {
                withMaven(maven: 'maven_3_8_1'){
                    sh 'mvn install'
                }
            }
        }

        stage ('Build') {
            steps {
                withMaven(maven: 'maven_3_8_1'){
                    sh 'mvn build'
                }
            }
        }

         stage ('Deploy') {
            steps {
                withMaven(maven: 'maven_3_8_1'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}