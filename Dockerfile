FROM openjdk:17

COPY target/SpringBoot_App /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java" ,"-jar" , "target/SpringBoot_App" ]