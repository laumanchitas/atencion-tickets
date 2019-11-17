#!/bin/sh
mvn clean package && docker build -t gt.com.plicod/atencion-tickets .
docker rm -f atencion-tickets || true && docker run -d -p 8080:8080 -p 4848:4848 --name atencion-tickets gt.com.plicod/atencion-tickets 
