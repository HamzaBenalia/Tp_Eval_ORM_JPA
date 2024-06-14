<img src="https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/2550121-modele-de-conception-de-logo-animalerie-vectoriel.jpg" width="1000" height="500">

# Gestion d'Animaleries avec Java et Spring Boot

Ce projet de gestion d'animaleries est développé avec Java et Spring Boot, utilisant une base de données MySQL pour le stockage des données. Il permet la gestion des animaleries, des produits, et des animaux associés à chaque magasin d'animaux.

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés sur votre machine :

- Java Development Kit (JDK) 17
- Apache Maven pour la gestion des dépendances
- MySQL Server pour la base de données
- Spring data Jpa
- Lombok (Economie en code)
- spring-boot-devtools
- Actuator (Health, metrics...)

## Installation et Configuration

### Clonage du Projet

Clonez le repository GitHub sur votre machine locale :

```bash
git clone https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA

```

### Configuration de la Base de Données

Configurez votre base de données MySQL et mettez à jour les informations de connexion dans le fichier application.properties situé dans src/main/resources.

spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_la_base_de_donnees
spring.datasource.username=votre_utilisateur
spring.datasource.password=votre_mot_de_passe

## Compilation et Exécution
Utilisez Maven pour compiler et exécuter le projet. À partir du répertoire racine du projet, exécutez :
mvn clean install


Cela compile le projet et installe les dépendances nécessaires.

Pour lancer l'application, exécutez la classe principale Application.java qui se trouve dans src/main/java/path/to/your/Application.java.

### Utilisation
Une fois l'application démarrée, vous pouvez :

Ajouter des Animaleries : Créez de nouvelles animaleries avec leurs détails comme la couleur et l'adresse.

Gérer les Produits : Ajoutez, mettez à jour et supprimez des produits comme de la nourriture pour animaux, des accessoires, etc.

Enregistrer des Animaux : Ajoutez de nouveaux animaux à une animalerie spécifique avec leurs informations détaillées.

## Consulter les Animaux

Vous avez deux options pour consulter les détails des animaux :

1. **Via la console :**
   - Démarrez l'application.
   - Entrez le numéro de l'animalerie que vous souhaitez consulter.
  
   -![Choix d'animalerie](https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/choix%20d'animalerie.png)


2. **Via un navigateur web :**
   - Vous pouvez accéder à toutes les informations telles que les détails de l'animalerie, son manager, les animaux et les produits en utilisant l'URL fournie.
   - L'URL à utiliser se trouve dans l'image ci-dessous.
  
   - ![PetStoreHamza](https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/PetStoreHamza.png)
  

## JavaDoc

Pour consulter la documentation JavaDoc générée pour ce projet, veuillez suivre le lien ci-dessous :

![Image Actuator]([https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/Actuator%20image%20.png](https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/javaDoc.png))
[JavaDoc](https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/JavaDoc/allclasses-index.html)

  
## Actuator

Actuator est un module Spring Boot qui fournit des fonctionnalités pour surveiller et gérer votre application. Il offre des endpoints prêts à l'emploi pour obtenir des informations sur l'état de l'application, les métriques, les traces, et bien plus encore. Pour l'application PetStore, Actuator peut être utilisé pour vérifier la santé de l'application, surveiller les performances et diagnostiquer les problèmes éventuels.

![Image Actuator](https://github.com/HamzaBenalia/Tp_Eval_ORM_JPA/blob/main/src/main/resources/images/Actuator%20image%20.png)

---

En intégrant Actuator dans votre projet, vous pouvez bénéficier d'une surveillance efficace et d'une gestion simplifiée de votre application PetStore.

## Contributions
Les contributions sous forme de suggestions, rapports de bugs et demandes de fonctionnalités sont les bienvenues. Pour contribuer au projet, veuillez ouvrir une issue pour discuter des changements majeurs ou soumettre une pull request directement.

## Auteurs
Ce projet est maintenu par Hamza. Il a été développé dans le cadre d'un projet scolaire.


