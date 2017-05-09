Streaming (spring spring-cloud-stream kafka) [![Build Status](https://travis-ci.org/daggerok/spring-streaming-with-kafka.svg?branch=master)](https://travis-ci.org/daggerok/spring-streaming-with-kafka)
============================================

Greater -> (messages) -> GreatingHandler -> (uppercased) -> Doubler -> (transformed) -> LogReceiver

```bash
gradle composeUp

gradle Greater:bootRun
gradle MessageReceiver:bootRun

gradle UpperCaser:bootRun
gradle Doubler:bootRun
gradle Logger:bootRun

gradle composeDown
gradle --stop
```

run all together for integration tests

```bash
gradle clean build
```

for testing run in order:
- kafka using docker-compose (read below)
- GreaterApplication
- UpperCaserApplication
- DoublerApplication
- LoggerApplication
- LogReceiverApplication (another logger)

[kafka (docker)](http://wurstmeister.github.io/kafka-docker):
```sh
# git clone https://github.com/wurstmeister/kafka-docker.git
# cd kafka-docker
# vim docker-compose-single-broker.yml # update 'host' and 'topics'
# docker-compose -f docker-compose-single-broker.yml up -d
gradle composeUp
gradle composeDown
```
