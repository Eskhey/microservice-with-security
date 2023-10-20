# microservice-with-security
**Overlay**
Two microservices (Both this services doesn't depict any real world logic meaning they are meant for testing purpose)
  -  productservice
  -  personservice
  -  apigateway
  -  configserver
  -  serviceergistry
  -  authenticationservice

- Communication between the two service is depicted in this repository
- Authenticationservice implements usings spring security - jwt.

**Working**
- any request is channelled to apigate from which authenticationservice is called if the user doesnt have any valid tocken.
- if there is a valid tocken access is granted.
- no authentication required to use authenticationservice(logically u can't ask to authenticate to access authenticationservice)
