def call(String project) {


  sh "docker -v"
  sh "docker build -t king-httpd ."
  sh "docker image list"
        
  sh 'docker build . -t josh1991/king-httpd:king-httpd'
	           withCredentials([string(credentialsId: 'DOCKER_HUB_PASSWORD', variable: 'PASSWORD')]){
		   
	 	    
			          sh 'docker login -u josh1991 -p $PASSWORD'
			          sh "docker push josh1991/king-httpd:king-httpd"
			}
}
