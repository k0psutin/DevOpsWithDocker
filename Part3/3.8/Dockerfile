FROM openjdk:8-alpine

EXPOSE 8000

RUN apk --no-cache add docker git

RUN git clone https://github.com/k0psutin/doge

CMD docker build -t doge doge/. && \
    docker login && \
    docker tag doge k0psutin/sample_project && \
    docker push k0psutin/sample_project
