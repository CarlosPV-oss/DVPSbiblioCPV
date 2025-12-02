pipeline{
    agent any

    tools {
        jdk 'jdk-21'
        maven 'Maven3.9.11'
    }

    stages {
        stage('Show messages'){
        steps {
                echo "Primer stage del pipeline"
                echo "A continuacion hacemos checkout del proyecto"
            }
          }

    stage('check out proyecto'){
        steps{
            git branch: 'main',
                url:'https://github.com/CarlosPV-oss/DVPSbiblioCPV.git'
        }
    }
    }
    }