FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD organization-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV CLOUD_SEA_CONFIG_SERVER_URI=http://172.17.0.2:9001
ENV SPRING_APPLICATION_NAME=organization-service
ENV MONGO_HOST=139.59.33.41
ENV MONGO_PORT=27017
ENV MONG_DATABASE_NAME=CLOUDSEA_ORGS
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
