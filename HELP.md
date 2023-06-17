# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.0/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


### Start Zookeeper
    bin/zookeeper-server-start.sh config/zookeeper.properties
### Start kafka
    bin/kafka-server-start.sh config/server.properties
### Consumer messages ( Follow spring-kafka-consumer branch for spring-boot kafka consumer)
    bin/kafka-console-consumer.sh --topic demo-kafka-topic --from-beginning --bootstrap-server localhost:9092
### Start Mongodb
    brew start service mongodb/brew/mongodb-community
### Run a gradle base springboot project
     gradle bootRun   