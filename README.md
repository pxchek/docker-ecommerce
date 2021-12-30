# docker-ecommerce

mvn clean

mvn install - Build container images

docker-compose up - Create and run the containers with microservices.

docker-ecommerce % docker-compose ps

NAME                 COMMAND                  SERVICE              STATUS                PORTS
cart-service         "java -jar cart-serv…"   cart-service         running               0.0.0.0:7000->8080/tcp
checkout-serice      "java -jar checkout-…"   checkout-service     running               0.0.0.0:7001->8080/tcp
docker-ecomm-mysql   "docker-entrypoint.s…"   docker-ecomm-mysql   running (unhealthy)   0.0.0.0:6668->3306/tcp
order-service        "java -jar order-ser…"   order-service        running               0.0.0.0:7002->8080/tcp
product-service      "java -jar product-s…"   product-service      running               0.0.0.0:7003->8080/tcp