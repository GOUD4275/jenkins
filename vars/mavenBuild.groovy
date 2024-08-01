def call() {
  post { 
        always { 
            cleanWs()
        }
  }
}
