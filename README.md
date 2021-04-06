## Deploying Spring Boot to AKS

#### Create Azure Resource Groups

```
az group create --name={resource name} --location={region}
```

#### Create Azure Container Registry

```
az acr create --resource-group {resource name} --location {region}  --name {container registry name} --sku Basic
```

#### Login to ACR

```
az acr login -n ${container registry name}
```

#### Azure AKS Cluster

```
az aks create --resource-group={resource name} --name={aks cluster name} --attach-acr {container registry name} --dns-name-prefix=sso-aks-dns --generate-ssh-keys
```

#### AKS Cluster configuration

```
az aks get-credentials --resource-group={resource name} --name={aks cluster name}
```

#### Deploy image to AKS

```
kubectl run {application name} --image={container registry uri}/{application name}:{version}
```

###### Relevant Articles:

- [Keycloak Embedded in a Spring Boot Application](https://www.baeldung.com/keycloak-embedded-in-spring-boot-app)
- [Azure Spring Boot Deployment](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/deploy-spring-boot-java-app-on-kubernetes)