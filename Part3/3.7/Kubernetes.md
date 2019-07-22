### Why and when to use Kubernetes?

You have published your first application, configured it for the server and you feel accomplished. What about migrating your application to another server? 

You're uploading your application into a new server, configuring it all over again. But, then you discover how to make containers. Application is now inside a *container* you can easily launch the application on any host just by using - **Docker** - *for example.* 

But is it enough? Your application is growing, and website traffic is more demanding, forcing you to scale your application once in a while and managing multiple containers is getting more stressful.

**That is where Kubernetes steps into play.**

In **Kubernetes**, the host machine will serve as a *master node*, controlling *nodes* with *containers* (or *pods*) where you can have your application *containers* (*pods*). *Nodes* are automatically increased (or decreased) depending on server load and demand. Even if your container should fail or disconnect, **Kubernetes** will ensure continuation of the application by launching new pods. In the event of error, users will be redirected on new nodes, and they won't even notice there is a problem. 

![Kubernetes_overview](https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Kubernetes.png/660px-Kubernetes.png)          
*source https://en.wikipedia.org/wiki/Kubernetes*


**Kubernetes** will help you organize a large scale app because you can control all containers from a single CLI. Update coming? No problem, you can easily update all containers from **Kubernetes CLI**, and roll them onto containers automatically, without any downtime. All the pods can also share the same storage (volumes), so none of the data is lost if the pods stop functioning.

Wait, what about **Docker Swarm**?

**Docker Swarm** is the official tool to organize **Docker** containers. Where **Kubernetes** is bit complex to install and use, **Docker Swarm** is more user friendly, and has a lot of documentation on the Docker homepage. Both applications are similar, and it is up to you to decide which one you will use.



