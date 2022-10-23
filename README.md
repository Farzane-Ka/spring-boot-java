# spring-boot-java

## an application for system usability scale
SUS (System Usability Scale) is a tool for measuring the usability of a system. It consists of 10 questions with 5 answer options from strongly disagree to strongly
agree. See the documention [here](https://www.usability.gov/how-to-and-tools/methods/system-usability-scale.html)

- The application is deployed, and the jar file is added to the git
- to run the application: **java -jar .\sus-0.0.1-SNAPSHOT.jar**
- in a browser, open http://localhost:8080 to see the homepage containing a form of questionnaire with five response options
- a user must answer to the 10 questions before seeing the resulting scale 
- aftre clicking the **compute** button the user sees the scale of SUS and the result is saved to an H2 database
- the tab **global scores** shows all the stored scales from the database
- the tab **home** redirects the user to the questionnaire form
- check the database in: http://localhost:8080/h2-console/  
- in the prompt console for H2 database, no username or password is needed, JDBC url: jdbc:h2:~/springboot




 
