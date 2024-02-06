pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	stages {

		stage('Build'){
			steps {
				sh "./mvnw clean package -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "./mvnw test"
			}
		}

		stage('Deploy') {
			steps {
			    sh "./mvnw jar:jar deploy:deploy"
			}
		}
	}
}