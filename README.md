# 🧑‍🌾 Farms Manager API
A farms manager and monitorer API, developed as a [Trybe](https://www.betrybe.com) Project.

## 💻 About this project
This is a API built in Java and using Spring framework, with which the user can monitor and manager a system of farms and theirs crops. The API has endpoints that allow the users to: register new farms, set crops to a farm, search farms by ID, search all farms and search for all crops from a farm. The available endpoints are listed in a section below.


## 🛠️ Built with
<a href="https://www.java.com/en/download/help/whatis_java.html" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" /></a>
<a href="https://spring.io/quickstart" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring" /></a>

## 🎯 Used skills
- Spring Boot;
- Spring Actuator;
- Spring Data JPA
- RESTful API development;
- Controller and service layers architecture;
- Java Exceptions handling;
- App dockerization.

## 🏁 Getting started
### 🐋 Installing Docker and Docker Compose
As the project is containerized, to run the application you will need to install Docker and Docker Compose. The Docker version used in this project was 24.0.7. You can see [here](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04) how to install it. The Docker Compose version supported by the project is 1.29 or higher. You can see [here](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-ubuntu-20-04-pt) or in the [docs](https://docs.docker.com/compose/install/) how to install it.

> ⚠️ <b>Before containers creation</b>:
> 
> This project has a  seeder for the farms table. If you want to unable it, you must comment the `com/betrybe/agrix/initializer/DatabaseSeeder.java` file content before run the commands bellow.

### 📦🏃‍♀ Creating Docker containers and running the application
In project root terminal, run:
```
docker-compose up -d
```
Once the container is created (or after starting the container), the application will start running automatically, unless the port 8080 is already in use. You can start the container with `docker start agrix-app` after stopping the process using the port 8080. You can stop the containers running `docker stop agrix-app` or `docker stop agrix-db`.

## 🛣️ Available endpoints
To use the API services you will can use a web browser or a client for APIs testing, like [Thunder Client](https://www.thunderclient.com) or [Insomnia](https://insomnia.rest/download).
The API endpoints are listed in the table below, as well as some examples of request body after the table.

Services and endpoints:
| Service | Method | Endpoint |
|  :---:  | :----: | :------: |
| Register a farm | POST | http://localhost:8080/farms |
| Set a crop | POST | http://localhost:8080/{farmId}/crops |
| Get all farms | GET | http://localhost:8080/farms |
| Get a farm by ID | GET | http://localhost:8080/farms/{farmId} |
| Get all crops from a farm | GET | http://localhost:8080/farms/{farmId}/crops |

> Request body example to register a farm:
> ```
> {
>  "name": "cenoura",
>  "size": 10
> }
> ```


> Request body example to set a crop:
> ```
> {
>  "name": "cenoura",
>  "plantedArea": 5.43
> }
> ```

> To set a crop to a farm, you need to pass the farm ID in the endpoint, as in `http://localhost:8080/1/crops`
