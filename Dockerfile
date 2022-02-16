FROM openjdk:13
ADD target/custom-pom.jar custom-pom.jar.jar
ENTRYPOINT ["java","-jar","/custom-pom.jar.jar"]