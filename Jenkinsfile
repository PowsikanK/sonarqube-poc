pipeline {
    agent any
    tools{
    maven 'maven'
    }
    stages {
        stage('Build') {
                steps {
    		sh "mvn clean install -DskipTests"
                }
            }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv(installationName: 'sonarqube') {
                    sh "mvn clean install org.sonarsource.scanner.maven:sonar:sonar"
                }
            }
        }
        stage('Quality Gate') {
            steps {
                timeout(time: 2, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
