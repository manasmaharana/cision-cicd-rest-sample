# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.accion.cision.rest.sample.rest-sample' is invalid and this project uses 'com.accion.cision.rest.sample.restsample' instead.

# Getting Started

### How to build and run  
* Get the code base to your local - **git clone https://github.com/manasmaharana/cision-cicd-rest-sample **
* Build - _mvn clean install_
* Run through Spring Boot - mvn spring-boot:run

### Rest API Detail
* Check all available Panels: http://localhost:8080/cision/panels/ - GET method - Headers as {"Accept": "application/json"}
* Add a new Panel: http://localhost:8080/cision/addPanel - POST method - Headers as {"Accept": "application/json", "Content-Type": "application/json"} - Body as raw JSON(application/json) type with value as {"panelName": "AAA BBB", "techStream": "XXX", "levels": ["Level1", "Level2"], "detail": "NA"}  
<Verified in postman>

### Reference Documentation
* TODO - Reefer later