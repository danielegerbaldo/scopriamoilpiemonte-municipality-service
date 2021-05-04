# scopriamoilpiemonte-municipality-service
ScopriamoIlPiemonte Municipality Microservice Repository

## Docker-compose example file
<pre><code>version: "3.7"
services:
   db-italian-municipalities:
      image: dangerbaldo/db-italian-municipalities:latest
      environment:
          POSTGRES_USER: admin
          POSTGRES_PASSWORD: password
          POSTGRES_DB: Italia
      volumes:
         - db-italian-municipalities:/usr/app/

   pgadmin:
        image: dpage/pgadmin4:latest
        environment:
            PGADMIN_DEFAULT_EMAIL: admin@pgadmin.com
            PGADMIN_DEFAULT_PASSWORD: password
            PGADMIN_LISTEN_PORT: 6060
        ports:
            - 6060:6060
        volumes:
            - pgadmin:/var/lib/pgadmin
        depends_on:
            - db-italian-municipalities
   
   servizio-comuni:
      image: dangerbaldo/scopriamoilpiemonte-municipality-service:latest
      container_name: servizio-comuni
      expose: 
         - 8080
      ports:
         - 8080:8080
      volumes:
         - servizio-comuni:/usr/app/

volumes:
   db-italian-municipalities:
   pgadmin:
   servizio-comuni:
</code></pre>
## Installation
<pre><code>How to run it with docker-compose:
$> docker-compose up
</code></pre>
