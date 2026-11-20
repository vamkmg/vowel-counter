
pipeline {

    // Run the pipeline on any available Jenkins agent
    agent any
    
    tools {
    jdk 'JDK21'
    maven 'Maven3'
}

    stages {

        // Stage 1: Get source code from GitHub
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        // Stage 2: Verify Java, Maven and Git
        stage('Check Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
                bat 'git --version'
            }
        }

        // Stage 3: Compile, test and package
        stage('Build and Test') {
            steps {
                bat 'mvn -B clean verify'
            }
        }

        // Stage 4: Archive the executable JAR
        stage('Archive Application') {
            steps {
                archiveArtifacts(
                    artifacts: 'target/*.jar',
                    fingerprint: true
                )
            }
        }
    }

    // Publish JUnit test results even if a test fails
    post {

        always {
            junit(
                testResults: 'target/surefire-reports/*.xml',
                allowEmptyResults: true
            )
        }

        success {
            echo 'Room Management build completed successfully!'
        }

        failure {
            echo 'Room Management build failed. Check the Jenkins console logs.'
        }
    }
}
