## Create Springboot Project
``` 
https://start.spring.io/
```

## Build the Project
```  
mvn clean install
```

## Docker image Creation
``` 
mvn install dockerfile:build
```

## Run the Project
``` 
cd docker

docker-compose up -d

cd..

mvn spring-boot:run

cd docker

docker-compose down
```

## Docker commands
``` 
docker ps -a

docker stop <CONTAINER-ID>

docker rm <CONTAINER-ID>

docker rmi <IMAGE-ID>
```

## Testing

### Doctor Controller
``` 
curl --location --request GET 'localhost:8081/doctor/doctor-appointment?doctorName=abc' \
--header 'Authorization: Basic RG9jdG9yOmRvY3Rvcg==' \
--header 'Cookie: JSESSIONID=BA15E08B8C532E2F4C2FCD8CD494D711'


curl --location --request POST 'localhost:8081/doctor/save' \
--header 'Authorization: Basic RG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=BA15E08B8C532E2F4C2FCD8CD494D711' \
--data-raw '{
    "appointmentId":"123",
    "patientName":"xyz",
    "doctorName":"abc",
    "date":"7-02-2023",
    "prescription":{
        "prescriptionId":"67",
        "appointmentId":"123",
        "description":"cough",
        "patientName":"xyz",
        "doctorName":"abc"
    }
}'
```

### Patient Controller
``` 
curl --location --request GET 'localhost:8081/patient/myappointment?patientName=xyz' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=BA15E08B8C532E2F4C2FCD8CD494D711'


curl --location --request POST 'localhost:8081/patient/save' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=BA15E08B8C532E2F4C2FCD8CD494D711' \
--data-raw '{
    "appointmentId":"123",
    "patientName":"xyz",
    "doctorName":"abc",
    "date":"7-02-2023",
    "prescription":{
        "prescriptionId":"67",
        "appointmentId":"123",
        "description":"cough",
        "patientName":"xyz",
        "doctorName":"abc"
    }
}'
```

### Prescription Controller
``` 
curl --location --request GET 'localhost:8081/prescription/view-prescription?patientName=xyz' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=BA15E08B8C532E2F4C2FCD8CD494D711'


curl --location --request POST 'localhost:8081/prescription/saveprescription' \
--header 'Content-Type: application/json' \
--data-raw '{
    "prescriptionId":"67",
    "appointmentId":"123",
    "description":"cough",
    "patientName":"xyz",
    "doctorName":"abc"
}'
```

## Swagger
``` 
http://localhost:8081/swagger-ui/index.html
```

## Credentials
``` 
ROLE:DOCTOR-->Username:Doctor-->Password:doctor

ROLE:PATIENT-->Username:Patient-->Password:patient
```
