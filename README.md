# kbe-rest-brewery
 Spring MVC RESTful API

Based on [this](https://github.com/springframeworkguru/kbe-rest-brewery) and updated to use Spring Framework 6/Spring Boot 3.

### Docker Commands

These commands are to be run from the root directory of the project.

``` docker build  -f ./src/main/dockerBase/Dockerfile -t kbe-rest . ```

``` docker run -p 8080:8080 -d kbe-rest ```

To show the logs in the console while running omit the ```-d``` (detached) flag.

