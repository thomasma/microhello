## Say hello to Micronaut inside Kubernetes (with Prometheus & Grafana)

In the age of Serverless & Container architectures, there is once again chatter about Java being too fat (and dying). While I can understand the “too fat” observation, I will not put my money on the “java is dying/dead” chatter. That obituary has been written multiple times and the language lives on. It is true that Java was not born in the Container/Cloud era. Yes, it was born in a different age and time, but the language and framework ecosystem has evolved. In the Microservices cloud native app world where horizontal scaling and fast startup times are expected, Java may (at times depending on the architecture) not be the fastest horse in town.

By the time you package a Spring service with some usually required needs (logging, jpa, monitoring, security, messaging, etc.) the final jar file can be quite large. Every dependency needs to be pulled in regardless of whether it is actually used in the runtime app or not.

New frameworks like [Micronaut](https://micronaut.io/) and [Quarkus](https://quarkus.io/) are trying to prepare Java for the new world of Serverless & Containers. 

See more details at [https://blogs.justenougharchitecture.com/say-hello-to-micronaut-inside-kubernetes-with-prometheus-grafana/]
