FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/anaplan-dashboards*.jar
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:2020
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]