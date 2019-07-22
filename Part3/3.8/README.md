## Repository directory:

https://github.com/k0psutin/doge

Webhook in branch *webhook*, automatically build an image to https://cloud.docker.com/u/k0psutin/repository/docker/k0psutin/sample_project in event of change


### Steps:

*docker build -t doge .*

*docker run -it -p 80:80 -v /var/run/docker.sock:/var/run/docker.sock doge*


**Example output:**

<pre><font color="#8AE234"><b>k0psutin@k0psutin</b></font>:<font color="#729FCF"><b>~/Documents/DevOps/practice/part3</b></font>$ docker run -it -p 8000:8000 -v /var/run/docker.sock:/var/run/docker.sock doge
Sending build context to Docker daemon  59.39kB
Step 1/3 : FROM nginx:alpine
 ---&gt; ea1193fd3dde
Step 2/3 : MAINTAINER k0psutin
 ---&gt; Using cache
 ---&gt; d966b734d4dd
Step 3/3 : COPY . /usr/share/nginx/html
 ---&gt; e612230949b7
Successfully built e612230949b7
Successfully tagged doge:latest
Login with your Docker ID to push and pull images from Docker Hub. If you don&apos;t have a Docker ID, head over to https://hub.docker.com to create one.
Username: k0psutin
Password: 
WARNING! Your password will be stored unencrypted in /root/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credentials-store

Login Succeeded
The push refers to repository [docker.io/k0psutin/sample_project]
0c0fba6d2523: Pushed 
fbe0fc9bcf95: Layer already exists 
f1b5933fe4b5: Layer already exists 
latest: digest: sha256:27cf5cbce114ec4b9ff89ab1ddf256518e24d7ac3ae5aae3d603eee45c3c23b5 size: 947
</pre>
