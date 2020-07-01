FROM davidcaste/alpine-tomcat:jre8tomcat8

COPY ./build/distributions/war/devra.war /bin/tomcat/webapps/

EXPOSE 8080

ENTRYPOINT ["/bin/tomcat/bin/catalina.sh", "run"]



