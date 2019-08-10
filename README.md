# ff4j-spring-example
This is a POC for important features of ff4j project

### Prerequisite

1. You have java and mvn setup
2. Port number 7070 is free

### Build and Run:

`mvn jetty:run`

### Login page
`http://localhost:7070/ff4j-poc/`

or
 
`http://localhost:7070/ff4j-poc/login`

**Use following credentials:**

admin/admin
user/user 


###  Access FF4J console 
`http://localhost:7070/ff4j-poc/ff4j-console`

### Access examples
`http://localhost:7070/ff4j-poc/discount` 

----------


# HOW TOS

**How to change port application running on:**

Change `httpConnector.port` inside pom.xml for jetty-maven-plugin  