# Microservice-Spring Boot Version 3

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)

# Currency Exchange Service

http://localhost:8081/currency-exchange/exchange-controller/welcome

http://localhost:8081/currency-exchange/exchange-controller/exchangeinfos

http://localhost:8081/currency-exchange/exchange-controller/exchangeinfo/from/INR/to/USD


# Currency Conversion Service

http://localhost:8091/currency-conversion/conversion-controller/welcome

http://localhost:8091/currency-conversion/conversion-controller/conversioninfo/from/INR/to/USD/quantity/555


# Docker 

### Docker Compose build 

##### Build all services
docker-compose --compatibility -f docker-compose.yml up -d --build

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



#Kubernaties (Reference comments)

docker run -p 8080:8080 in28min/hello-world-rest-api:0.0.1.RELEASE

kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl scale deployment hello-world-rest-api --replicas=3
kubectl delete pod hello-world-rest-api-58ff5dd898-62l9d
kubectl autoscale deployment hello-world-rest-api --max=10 --cpu-percent=70
kubectl edit deployment hello-world-rest-api #minReadySeconds: 15
kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE

gcloud container clusters get-credentials in28minutes-cluster --zone us-central1-a --project solid-course-258105
kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl set image deployment hello-world-rest-api hello-world-rest-api=DUMMY_IMAGE:TEST
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get componentstatuses
kubectl get pods --all-namespaces

kubectl get events
kubectl get pods
kubectl get replicaset
kubectl get deployment
kubectl get service

kubectl get pods -o wide

kubectl explain pods
kubectl get pods -o wide

kubectl describe pod hello-world-rest-api-58ff5dd898-9trh2

kubectl get replicasets
kubectl get replicaset

kubectl scale deployment hello-world-rest-api --replicas=3
kubectl get pods
kubectl get replicaset
kubectl get events
kubectl get events --sort.by=.metadata.creationTimestamp

kubectl get rs
kubectl get rs -o wide
kubectl set image deployment hello-world-rest-api hello-world-rest-api=DUMMY_IMAGE:TEST
kubectl get rs -o wide
kubectl get pods
kubectl describe pod hello-world-rest-api-85995ddd5c-msjsm
kubectl get events --sort-by=.metadata.creationTimestamp

kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-n6c7l
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-8bhdt

gcloud container clusters get-credentials in28minutes-cluster --zone us-central1-c --project solid-course-258105
docker login
docker push in28min/mmv3-currency-exchange-service:0.0.11-SNAPSHOT
docker push in28min/mmv3-currency-conversion-service:0.0.11-SNAPSHOT

kubectl create deployment currency-exchange --image=in28min/mmv3-currency-exchange-service:0.0.11-SNAPSHOT
kubectl expose deployment currency-exchange --type=LoadBalancer --port=8000
kubectl get svc
kubectl get services
kubectl get pods
kubectl get po
kubectl get replicaset
kubectl get rs
kubectl get all

kubectl create deployment currency-conversion --image=in28min/mmv3-currency-conversion-service:0.0.11-SNAPSHOT
kubectl expose deployment currency-conversion --type=LoadBalancer --port=8100

kubectl get svc --watch

kubectl get deployments

kubectl get deployment currency-exchange -o yaml >> deployment.yaml 
kubectl get service currency-exchange -o yaml >> service.yaml 

kubectl diff -f deployment.yaml
kubectl apply -f deployment.yaml

kubectl delete all -l app=currency-exchange
kubectl delete all -l app=currency-conversion

kubectl rollout history deployment currency-conversion
kubectl rollout history deployment currency-exchange
kubectl rollout undo deployment currency-exchange --to-revision=1

kubectl logs currency-exchange-9fc6f979b-2gmn8
kubectl logs -f currency-exchange-9fc6f979b-2gmn8 

kubectl autoscale deployment currency-exchange --min=1 --max=3 --cpu-percent=5 
kubectl get hpa

kubectl top pod
kubectl top nodes
kubectl get hpa
kubectl delete hpa currency-exchange

kubectl create configmap currency-conversion --from-literal=CURRENCY_EXCHANGE_URI=http://currency-exchange
kubectl get configmap

kubectl get configmap currency-conversion -o yaml >> configmap.yaml

watch -n 0.1 curl http://34.66.241.150:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

docker push in28min/mmv3-currency-conversion-service:0.0.12-SNAPSHOT
docker push in28min/mmv3-currency-exchange-service:0.0.12-SNAPSHOT
