FROM openjdk:11
EXPOSE 8089
ADD target/docker-sts.jar docker-sts.jar
ENTRYPOINT ["java","-jar","docker-sts.jar"]