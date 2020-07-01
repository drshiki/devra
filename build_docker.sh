#! /bin/sh

./gradlew buildWar
docker build -t devra .
docker run --name devra -p:18080:8080 -d devra-instance