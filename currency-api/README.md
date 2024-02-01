# Microservice-Spring Boot Version 3

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)

# Currency Exchange Service

http://localhost:8081/exchange-service/exchange-controller/exchangeinfo/welcome

http://localhost:8081/exchange-service/exchange-controller/exchangeinfo/from/INR/to/USD


# Currency Conversion Service

http://localhost:8091/conversion-service/conversion-controller/conversioninfo/welcome

http://localhost:8091/conversion-service/conversion-controller/conversioninfo/from/INR/to/USD/quantity/555


# Eureka

http://localhost:8761/


# API Gateway Server

### Currency Exchange Service

http://localhost:8765/exchange-service/exchange-controller/exchangeinfo/welcome

http://localhost:8765/exchange-service/exchange-controller/exchangeinfo/from/INR/to/USD


### Currency Conversion Service

http://localhost:8765/conversion-service/conversion-controller/conversioninfo/welcome

http://localhost:8765/conversion-service/conversion-controller/conversioninfo/from/INR/to/USD/quantity/555


# Docker 

### Docker Compose build 

##### Build all services
docker-compose --compatibility -f docker-compose.yml up -d --build

##### Build Naming Server
docker-compose --compatibility -f docker-compose.yml up -d --build naming-server

##### Build Zipkin Server
docker-compose --compatibility -f docker-compose.yml up -d --build zipkin-server

##### Build API Gateway Server
docker-compose --compatibility -f docker-compose.yml up -d --build apigateway-server

##### Build Currency Exchange Service
docker-compose --compatibility -f docker-compose.yml up -d --build exchange-service

##### Build Currency Conversion Service
docker-compose --compatibility -f docker-compose.yml up -d --build conversion-service



### Docker Compose build - Other Services
##### Build Kafka
docker-compose --compatibility -f docker-compose.yml up -d --build kafka

##### Build MYSQL
docker-compose --compatibility -f docker-compose.yml up -d --build mysql

##### Build Postgres
docker-compose --compatibility -f docker-compose.yml up -d --build postgres


### Docker Others

docker run -p -d 5000:5000 in28min/todo-rest-api-h2:1.0.0.RELEASE

docker logs 04e52ff9270f5810eefe1f77222852dc1461c22440d4ecd6228b5c38f09d838e

docker logs c2ba

docker logs -f c2ba

docker container ls

docker run -p -d 5001:5000 in28min/todo-rest-api-h2:1.0.0.RELEASE

docker images #one image - multiple containers

docker container ls -a #show stopped containers as well

docker container stop f708b7ee1a8b

docker run -p -d 5000:5000 in28min/todo-rest-api-h2:0.0.1-SNAPSHOT

### 

docker images

docker pull mysql #gets latest

docker search mysql

docker image history in28min/hello-world-java:0.0.1.RELEASE

docker image history 100229ba687e

docker image inspect 100229ba687e

docker image remove mysql

### 

docker run -p -d 5000:5000 in28min/todo-rest-api-h2:0.0.1-SNAPSHOT

docker container rm 3e657ae9bd16

docker container ls -a

docker container pause 832

docker container unpause 832

docker container stop 832 #SIGTERM

docker container kill 832 #SIGKILL

docker container inspect ff521fa58db3

docker container prune

docker run -p -d 5000:5000 --restart=always in28min/todo-rest-api-h2:0.0.1-SNAPSHOT #automatically  starts after docker desktop is restarted

### 
docker events #track events - launch and stop containers

docker top 9009722eac4d

docker stats 

docker stats 9009722eac4d

docker system

docker system df

docker system info

docker system prune -a

docker container run -p 5000:5000 -d -m 512m in28min/todo-rest-api-h2:0.0.1-SNAPSHOT

docker container run -p 5000:5000 -d -m 512m --cpu-quota=50000  in28min/todo-rest-api-h2:0.0.1-SNAPSHOT

docker system events

### 
docker push docker.io/in28min/mmv3-currency-exchange-service:0.0.1-SNAPSHOT

docker-compose --version

docker-compose up

docker push in28min/mmv3-naming-server:0.0.1-SNAPSHOT

docker push in28min/mmv3-currency-conversion-service:0.0.1-SNAPSHOT

docker push in28min/mmv3-api-gateway:0.0.1-SNAPSHOT

watch -n 0.1 curl http://localhost:8000/sample-api

