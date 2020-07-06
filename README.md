# LoadBalancing-Zuul
A demo on Load Balancing using Zuul

	1. Import the project myeurekaserver to IntelliJ Idea and start the server. 
  
	2. Import the project MyApp and Start the server.It will run at port 8081 mentioned in application.properties file.
  
	3. Now start the 2nd instance of same application by updating the Run configuration and add the VM Options as -Dserver.port=8082
     	   and check the check box "Allow parallel Run" in Intellij Idea.
     
	4. Now check the Eureka server home page. You will be able to see one client running on multiple ports.
  
	5. Import the project zuul and check the application.properties file to see how MyApp has been added to zuul.
  
	6. Now start zuul and try to hit the below url multiple times to see which instance it is taking up.
	http://localhost:8085/myapp/healthcheck

