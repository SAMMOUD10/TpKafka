# TpKafka
<b>-- Ceci le rapport du TP concernant la partie de diffusion (Streaming) distribuée en utilisant la plate-forme Kafka </b>
<p>À la suite du cours de la programmation distribué, dans ce tp on va aborder la notion de diffusion distribuée des données en utilisant la plate-forme Kafka,
qui permettre aux applications clientes Kafka de publier et s'abonner à des flux d'enregistrementq</p>
<p><b>L'application</b> développé est de type spring boot et elle est construit en trois couches principales:
<ol>
  <li>Entities</li>
  <li>Services</li>
  <li>Web</li>
</ol>
</p>

<h4>1/ Entities </h4>
<span> - Voici la structure de l'entité PageEvent, bien sûr identifiée par quelques propriètes</span> 
<br/>

![pageevent](https://user-images.githubusercontent.com/102219821/173162345-916dbb21-a031-45e5-a4e0-a94ce260ea27.png)

<h4>2/ Services </h4>
<span> - c'est dans laquel j'ai crée les consumers et producers qui vont produire des messages ainsi recevoir et faire des traitement sur les données dans
le temps réel.</span> 
<br/>

![services](https://user-images.githubusercontent.com/102219821/173162621-56712180-26ac-41a9-90af-d5917decdab9.png)

<h4>3/ Web </h4>
<span> - c'est ici j'ai définie mon controlleur, pour gérer l'application</span> 
<br/>

![web](https://user-images.githubusercontent.com/102219821/173162821-7a3d47d7-c695-4007-8e2c-ef33dd3ab4e9.png)

<h4>4/ Execution : Capture d'écrans d'execution de l'application </h4>
<span>4.1/ Lancement du Zookepper et Kafka</span>
<br/>

![zookepper](https://user-images.githubusercontent.com/102219821/173163475-07f416c1-0425-487a-b44d-78e4914ce704.png)

<br/>

![kafka](https://user-images.githubusercontent.com/102219821/173163491-5ef565cc-e4c3-4281-b3fe-0b1baee99a73.png)

<br/>
<span>4.2/ Création de producer et consumer ainsi e topic dans laquel les données vont être  du Zookepper et Kafka</span>
<br/>

![topic](https://user-images.githubusercontent.com/102219821/173163564-7ac1dd6f-4ec8-47ce-a601-367506fc4de6.png)

<br/>
<span>4.3/ Transmission des données entre le producer et consumer</span>
<br/>

<span>4.3.1/ Producer</span>
<br/>

![producer](https://user-images.githubusercontent.com/102219821/173163626-a9f9a596-006a-4d9c-b026-d887314d5189.png)

<br/>

![producer2](https://user-images.githubusercontent.com/102219821/173163772-3e94924c-94bf-40fd-9f37-8b3fbbff02d5.png)

<br/>
<span>4.3.2/ Consumer</span>
<br/>

![consumer](https://user-images.githubusercontent.com/102219821/173163640-d8bc83eb-b627-4bfe-a938-186cd4becd27.png)

<br/>

![consumer2](https://user-images.githubusercontent.com/102219821/173163780-cc7449f3-55e8-4b32-820e-a5011588d8ea.png)






