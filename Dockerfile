FROM openjdk:21
EXPOSE 8080
ADD build/libs/cicd-sample.jar cicd-sample.jar
ENTRYPOINT ["java","-jar","/cicd-sample.jar" ]