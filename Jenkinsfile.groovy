pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "This is Ambrosh's Projetcs Build stage."
            }
        }
        stage('Test') { 
            steps {
                echo "This is Ambrosh's Projetcs Test stage." 
            }
        }
        stage('Deploy') { 
            steps {
                echo "This is Ambrosh's Projetcs Deploy stage." 
            }
        }
    }
}
