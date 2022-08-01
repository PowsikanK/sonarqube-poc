pipeline {
    agent any
    tools {
          maven 'Maven 3.86'
          jdk 'jdk11'
        }
    stages {
        stage('Build') {
                steps {
    		sh "mvn clean install -DskipTests"
                }
            }
        stage('Package') {
                steps {
                    sh "mvn package"
                }
            }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv(installationName: 'sonarqube') {
                    sh "mvn clean install org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar"
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
