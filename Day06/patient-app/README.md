## Build the application
~~~
https://start.spring.io/
~~~

## Build the project
~~~
mvn clean install
~~~

## Run the application
~~~
mvn spring-boot:run
~~~

## Test The application
~~~
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bactrial"
}'
~~~
curl --location --request PUT 'localhost:8080/patient/update?disease=cold' 

~~~
