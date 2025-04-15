FROM openjdk:11
EXPOSE 9021
ADD target/springbootdockerjenkinsexample.jar springbootdockerjenkinsexample.jar
ENTRYPOINT ["java", "-jar","/springbootdockerjenkinsexample.jar"]