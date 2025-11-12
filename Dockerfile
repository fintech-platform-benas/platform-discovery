# Eureka Server - Payment Chain
# Service discovery and registration for microservices architecture
FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S paymentchain && adduser -S admin -G paymentchain
USER admin:paymentchain
WORKDIR /app
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS="-Xms128M -Xmx256M"
EXPOSE 8761
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar"]
