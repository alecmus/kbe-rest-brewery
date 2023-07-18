# kbe-rest-brewery
 Spring MVC RESTful API

Based on [this](https://github.com/springframeworkguru/kbe-rest-brewery) and updated to use Spring Framework 6/Spring Boot 3.

### Docker Commands

#### Without Layers

These commands are to be run from the root directory of the project.

``` docker build  -f ./src/main/dockerBase/Dockerfile -t kbe-rest . ```

``` docker run -p 8080:8080 -d kbe-rest ```

#### With Layers

``` docker build  -f ./src/main/docker/Dockerfile -t kbe-rest . ```

``` docker run -p 8080:8080 -d kbe-rest ```

#### Notes
- To show the logs in the console while running omit the ```-d``` (detached) flag.
- The -p flag is for publishing all exposed ports to the host interfaces. By specifying ```-p 8080:8080``` we are explicitly mapping the port 8080 within the docker context to the host's port 8080 to allow the application to be accessible via local port 8080 on the host machine.