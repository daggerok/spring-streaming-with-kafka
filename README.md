# Streaming (spring spring-cloud-stream kafka) [![Build Status](https://travis-ci.org/daggerok/spring-streaming-with-kafka.svg?branch=master)](https://travis-ci.org/daggerok/spring-streaming-with-kafka)

with time this shit is not going to work anymore... please ignore that repo!

Greater -> (messages) -> GreatingHandler -> (uppercased) -> Doubler -> (transformed) -> LogReceiver

<!--

```bash
gradle composeUp

gradle Greater:bootRun
gradle MessageReceiver:bootRun

gradle UpperCaser:bootRun
gradle Doubler:bootRun
gradle Logger:bootRun

gradle composeDown
```

-->

```bash
sdk use springboot 2.1.6.RELEASE
spring install org.springframework.cloud:spring-cloud-cli:2.1.0.RELEASE
spring cloud kafka

gradle Greater:bootRun
gradle MessageReceiver:bootRun

gradle UpperCaser:bootRun
gradle Doubler:bootRun
gradle Logger:bootRun

gradle --stop
```

run all together for integration tests

```bash
gradle clean build
```

for testing run in order:
- use `spring cloud kafka` for testing
- GreaterApplication
- UpperCaserApplication
- DoublerApplication
- LoggerApplication
- LogReceiverApplication (another logger)

_other way to run kafka with docker-compose_

```bash
# git clone --depth=1 https://github.com/confluentinc/cp-docker-images.git
# docker-compose -f cp-docker-images/examples/kafka-single-node/docker-compose.yml up -d
# docker-compose -f cp-docker-images/examples/kafka-single-node/docker-compose.yml down -v --rmi local
## or already cloned locally:
# docker-compose -f kafka/kafka-single-node/docker-compose.yml up -d
# docker-compose -f kafka/kafka-single-node/docker-compose.yml down -v --rmi local
## or just:
./gradlew composeUp
./gradlew composeDown
```

<!--

[kafka (docker)](http://wurstmeister.github.io/kafka-docker):
```sh
# git clone https://github.com/wurstmeister/kafka-docker.git
# cd kafka-docker
# vim docker-compose-single-broker.yml # update 'host' and 'topics'
# docker-compose -f docker-compose-single-broker.yml up -d
gradle composeUp
gradle composeDown
```

-->

