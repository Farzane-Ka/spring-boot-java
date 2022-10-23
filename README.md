# spring-boot-java

## an application for system usability scale
SUS (System Usability Scale) is a tool for measuring the usability of a system. It consists 10 questions with 5 answer options from strongly disagree to strongly
agree. See the documention here [link](https://www.usability.gov/how-to-and-tools/methods/system-usability-scale.html)

- run the application in [SusApplication](https://github.com/Farzane-Ka/spring-boot-java/blob/main/src/main/java/com/project/farzane/sus/SusApplication.java) in inteliJ 
- open the url http://localhost:8080 to see the homepage containing a form of questionnaires with five response options
- a user must answer to the 10 questions before seeing the resulting scale 
- aftre clicking compute button the user sees the scale of SUS and the result is saved to H2 database
- check the database in: http://localhost:8080/h2-console/  
- in the prompt console for H2 database, no username or password is needed, JDBC url: jdbc:h2:~/springboot
- the tab ** global scores ** shows all the entries from the database (all the scales)
- the tab ** home ** redirects the user the questionnaires form
 
