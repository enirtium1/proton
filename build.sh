#!/bin/bash

echo "Performing a clean Maven build"
./mvnw clean package -DskipTests=true

echo "Building the product-service"

docker-compose build 
# cd product-service
# docker build --tag proton-product-service .
# cd ..

# echo "Building the Gateway"
# cd security-gateway
# docker build --tag scg-demo-security-gateway .
# cd ..

# echo "Building the Service"
# cd secured-service
# docker build --tag scg-demo-secured-service .
# cd ..
