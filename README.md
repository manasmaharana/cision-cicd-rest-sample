# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.accion.cision.rest.sample.rest-sample' is invalid and this project uses 'com.accion.cision.rest.sample.restsample' instead.

# Getting Started

### How to build and run  
* Get the code base to your local - __git clone https://github.com/manasmaharana/cision-cicd-rest-sample__
* Build - __mvn clean install__
* Run through Spring Boot - __mvn spring-boot:run__

### Rest API Detail
* Check all available Panels: http://localhost:8080/cision/panels/ - GET method - Headers as {"Accept": "application/json"}
* Add a new Panel: http://localhost:8080/cision/addPanel - POST method - Headers as {"Accept": "application/json", "Content-Type": "application/json"} - Body as raw JSON(application/json) type with value as {"panelName": "AAA BBB", "techStream": "XXX", "levels": ["Level1", "Level2"], "detail": "NA"}  
__Verified in postman__

### Reference Documentation
* TODO - Reefer later