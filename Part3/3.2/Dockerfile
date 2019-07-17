FROM alpine:3.9

RUN apk add --no-cache ffmpeg gcc libxml2-dev libxslt-dev make musl-dev php7 php7-bcmath php7-curl php7-mcrypt \
    php7-simplexml py-crypto py-lxml py-pip py-setuptools python python2-dev rtmpdump && rm -rf /var/lib/apt/list/* \
        && pip install -U pip setuptools yle-dl

WORKDIR /out

ENTRYPOINT ["yle-dl"]
