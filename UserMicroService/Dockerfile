FROM adoptopenjdk/openjdk8:ubi
RUN mkdir /opt/app
COPY target/UserMicroService-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/UserMicroService-0.0.1-SNAPSHOT.jar"]