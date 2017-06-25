FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD organization-service-0.0.1-SNAPSHOT.jar organization-service-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /organization-service-0.0.1-SNAPSHOT.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /organization-service-0.0.1-SNAPSHOT.jar" ]