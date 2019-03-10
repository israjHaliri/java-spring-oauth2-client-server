## Needed stacks
    + maven 3
    + java8
    + mysql
    
## Technology stacks
    + maven 3
    + java8
    + mysql
    + springboot
    + thymeleaf
    + oauth2
    
## To get started follow this checklist:
    + create schema aouth2-authorize-server
    + import dump sql from docs directory
    + build project : cd java-springboot-oauth2-server &&  mvn clean install
    + build project : cd java-springboot-oauth2-client && mvn clean install
    + run project in target: java -jar java-springboot-oauth2-server-0.0.1-SNAPSHOT.jar
    + run project in target: java -jar java-springboot-oauth2-client-0.0.1-SNAPSHOT.jar
    + http://localhost:8081/authorize-server/oauth/token?grant_type=password&username=israj.haliri@gmail.com&password=12345
    + use auth like : Authorization Basic Y2xpZW50U2VydmVyOnNlY3JldA==