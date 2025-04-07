# 1. Java 21 kullan
FROM openjdk:21

# 2. JAR dosyasını container içine kopyala
COPY target/ymg-spring-0.0.1-SNAPSHOT.jar app.jar

# 3. Uygulamanın çalışacağı portu bildir (bilgilendirici)
EXPOSE 8080

# 4. Uygulamayı başlat
ENTRYPOINT ["java", "-jar", "/app.jar"]
