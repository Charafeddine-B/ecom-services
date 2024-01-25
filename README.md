# Spring Angular Ecom App

Application web full-stack, résultat de l'activité pratique n°4 du cours d'architectures microservice J2EE.

## Services:
- Config Service
- Gateway Service
- Customer Service
- Inventory Service
- Orders Service
- Billing Service
- Vault
- Consul

## Développement des microservices en J2EE

### Liste des services sur Consul

<img width="1680" alt="Screenshot 2023-12-03 at 16 30 43" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/1a435e4a-4b79-4abe-87f6-96f389a6a562">

### Repository des différentes configurations

<img width="1680" alt="Screenshot 2023-12-03 at 21 26 55" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/8ef3731f-d62f-4272-8873-f3c014f17040">

### Récupération de la configuration de chaque service depuis config-service

<img width="1680" alt="Screenshot 2023-12-03 at 21 28 25" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/ba181a1f-e4fe-484e-a1c7-d9caec1438f6">

### Configuration de Consul et de Vault

<img width="1680" alt="Screenshot 2023-12-03 at 21 29 35" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/b9e42542-53b9-43ce-a396-ab82707cfe83">

### Configuration des secrets sur Consul

- Ajout des secrets

<img width="1680" alt="Screenshot 2023-12-03 at 16 29 15" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/696ca1b4-aa2a-4fdf-8949-74cb130ee9dc">

- Récupération des secrets

<img width="1680" alt="Screenshot 2023-12-03 at 16 28 59" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/869a309c-a71f-48ac-861e-feb6a0ea34e4">

- Affichage des secrets

<img width="1680" alt="Screenshot 2023-12-03 at 16 28 52" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/50fdf69c-1978-4d42-9cc5-35ae874167a4">

### Configuration des secrets sur Vault

- Configuration de Vault en local

<img width="1680" alt="Screenshot 2023-12-03 at 16 28 14" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/4db7f85d-f39e-4f62-aa4c-27a0e3985b0e">

- Ajout des secrets sur Vault depuis l'UI
  
<img width="1680" alt="Screenshot 2023-12-03 at 16 27 49" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/92c780b2-c14c-4946-bbe6-08ee60de16e3">

- Ajout des secres sur Vault depuis le code
 
<img width="1680" alt="Screenshot 2023-12-03 at 21 37 43" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/44d74a6a-b995-4ce1-99c2-9c0a78e4e00a">

- Récupération des secrets

<img width="1680" alt="Screenshot 2023-12-03 at 21 36 22" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/c9defd20-601d-480b-a5d4-619a73674d74">

### La requête depuis la gateway qui démontre que tous les services marchent

<img width="1680" alt="Screenshot 2023-12-03 at 16 30 03" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/71034d5f-c329-4134-b09b-ae8096c78024">

## Développement du Frontend en Angular

### Ajout de CORS dans le backend

<img width="1680" alt="Screenshot 2023-12-03 at 21 40 45" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/6227ca71-6ccd-4b2d-9acd-6017db13acc6">

### Intégration du Module HTTP client dans les dépendances Angular

<img width="1680" alt="Screenshot 2023-12-03 at 21 41 54" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/24a9e71b-2699-4568-985f-b4ecbc7836fa">

### Développement des Composants UI

- Products component

<img width="1680" alt="Screenshot 2023-12-03 at 20 41 54" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/2903cebe-4d55-417d-b51e-9d35ef60764f">
  
- Customers component

<img width="1680" alt="Screenshot 2023-12-03 at 20 42 02" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/3fa74810-3a83-47dd-87b0-89032bc30f06">

- Orders component

<img width="1680" alt="Screenshot 2023-12-03 at 20 42 35" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/b3783600-cb24-4c36-838f-af43baa97c69">

- Order-details component

<img width="1680" alt="Screenshot 2023-12-03 at 20 42 51" src="https://github.com/DaddaAdam/FullStackSpringAngularEcomApp/assets/77986052/e9dfe4c6-6ce0-46a9-bd7b-c7db5bc86548">
