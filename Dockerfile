# Use a imagem Java 17 do AdoptOpenJDK
FROM adoptopenjdk:17-jre-hotspot

# Copie o JAR da sua aplicação para o contêiner
COPY ./desafio-tutor.jar /app/desafio-tutor.jar

# Comando para executar a aplicação
CMD ["java", "-jar", "/app/seu_app.jar"]
