FROM node

EXPOSE 5000
WORKDIR /app
COPY . /app

RUN curl -sL https://deb.nodesource.com/setup_10.x | bash
RUN apt install -y nodejs
RUN npm install


ENTRYPOINT npm start
