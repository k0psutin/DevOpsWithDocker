#For both Frontend and Backend

FROM ubuntu:16.04

WORKDIR /app
COPY . /app

RUN apt update && apt install -y curl &&\
    curl -sL https://deb.nodesource.com/setup_10.x | bash &&\
    apt install -y nodejs &&\
    npm install &&\
    apt-get purge -y --auto-remove curl && \
    rm -rf /var/lib/apt/lists/* && useradd -m app && chown -hR app /app
#server wouldn't start if i didn't add chwon -hR app /app, which gives user 'app' folder privileges

USER app
