# NYT 
NYT is a Spring-Boot demo project which fetches the top stories from New York Times api () and exposes them as a SOAP service.

## Endpoints
### REST
`/api/topstories`

### SOAP
`/services/topstoriesws`

#### List all services
`/services/`

## Build
```mvnw clean install```

## Run
```mvnw spring-boot:run```