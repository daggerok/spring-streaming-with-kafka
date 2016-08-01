Streaming (spring spring-cloud-stream kafka)
============================================

Greater -> (messages) -> GreatingHandler -> (uppercased) -> Doubler -> (transformed) -> LogReceiver

for testing run in order:
- kafka using docker-compose (see below)
- GreaterApplication
- UpperCaserApplication
- DoublerApplication
- LoggerApplication

[kafka (docker)](http://wurstmeister.github.io/kafka-docker):
```sh
git clone https://github.com/wurstmeister/kafka-docker.git
cd kafka-docker
vim docker-compose-single-broker.yml # update 'host' and 'topics'
docker-compose -f docker-compose-single-broker.yml up -d 
```
