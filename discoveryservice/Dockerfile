FROM adoptopenjdk/openjdk8:ubi
RUN mkdir /opt/app
COPY target/discoveryservice-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/discoveryservice-0.0.1-SNAPSHOT.jar"]