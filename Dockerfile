FROM openjdk:8
EXPOSE 8090
ADD target/jncp-demo.jar jncp-demo.jar
ENTRYPOINT ["java", "-jar", "/jncp-demo.jar"]
CMD java -jar com.jncp-1.0.0-snapshot.jar


