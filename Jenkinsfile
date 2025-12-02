pipeline{
    agent any

    tools {
        jdk 'jdk-24'
        maven 'Maven3.9.11'
    }

    stages {
        stage('Show messages'){
        steps {
                bat 'Primer stage del pipeline'
                bat 'A continuacion hacemos checkout del proyecto'
            }
          }

    stage('check out proyecto'){
        steps{
            git branch: 'main',
                url:'https://github.com/CarlosPV-oss/DVPSbiblioCPV.git'
        }
    }

    stage('Maven clean'){
        steps{
            bat 'mvn clean'
        }
    }
    }
    }