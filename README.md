# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.accion.cision.rest.sample.rest-sample' is invalid and this project uses 'com.accion.cision.rest.sample.restsample' instead.

# Getting Started

### Prerequisites 
* For Kafka API specification testing, make sure Zookeeper and Kafka server is up and running

### How to build and run  
* Get the code base to your local - __git clone https://github.com/manasmaharana/cision-cicd-rest-sample__
* Build - __mvn clean install__
* Run through Spring Boot - __mvn spring-boot:run__

### Rest API Detail
* Check all available Panels: http://localhost:8080/cision/panels/ - GET method - Headers as {"Accept": "application/json"}
* Add a new Panel: http://localhost:8080/cision/addPanel - POST method - Headers as {"Accept": "application/json", "Content-Type": "application/json"} - Body as raw JSON(application/json) type with value as {"panelName": "AAA BBB", "techStream": "XXX", "levels": ["Level1", "Level2"], "detail": "NA"}  
__Verified in postman__
* Also added Swagger UI to check all API's from : http://localhost:8080/swagger-ui.html 

### Reference Documentation
* How to install and run Apache Kafka - https://docs.google.com/document/d/1g-81kznEAX1sFsX7oOahKubx9rGtbzJRoHhatKf_7i4/edit
* Currently we are commenting the all kafka codes, as this need kafka/zookeeper server. And can be uncomment and execute once you run these server.
* TODO - Other references later