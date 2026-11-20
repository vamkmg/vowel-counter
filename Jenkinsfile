
pipeline {

    // Run the pipeline on any available Jenkins agent
    agent any

    stages {

        // Stage 1: Get source code from GitHub
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        // Stage 2: Compile, test and package
        stage('Build and Test') {
            steps {
                sh 'mvn -B clean verify'
            }
        }

        // Stage 3: Archive the executable JAR
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
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'Vowel Counter build completed successfully!'
        }

        failure {
            echo 'Vowel Counter build failed. Check the logs.'
        }
    }
}
