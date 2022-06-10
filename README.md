# TpKafka
<b>-- Ceci le rapport du TP concernant la partie de diffusion (Streaming) distribuée en utilisant la plate-forme Kafka </b>
<p>À la suite du cours de la programmation distribué, dans ce tp on va aborder la notion de diffusion distribuée des données  en utilisant la plate-forme Kafka,
ce qui permettre aux applications clientes Kafka de publier et s'abonner à des flux </p>
<p><b>Alors pour ce TP</b>, nous avons développée le même application que nous avons fait dans le tp01 en respectant toutes les normes et les étapes sauf que cette fois-ci.
nous avons utilisé le framework Spring qui va s'occupe la couche DAO, c'est â dire que le développeur va se concentrer seulement sur les besoins fonctionnelles, et ça
va nous facilite beaucoup le développement, c'est ce que on appelle l'inversion de contrôle.</p>
<p><b>L'application</b> développé est de type maven et elle est construit en trois couches principales:
<ol>
  <li>Couche DAO</li>
  <li>Couche Metier</li>
  <li>Couche Web ou Présentation</li>
</ol>
