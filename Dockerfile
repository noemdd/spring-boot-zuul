FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/zuul-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]