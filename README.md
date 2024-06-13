# Gestion d'Animaleries avec Java et Spring Boot

Ce projet de gestion d'animaleries est développé avec Java et Spring Boot, utilisant une base de données MySQL pour le stockage des données. Il permet la gestion des animaleries, des produits, et des animaux associés à chaque magasin d'animaux.

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés sur votre machine :

- Java Development Kit (JDK) 17
- Apache Maven pour la gestion des dépendances
- MySQL Server pour la base de données

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

Ajouter des Animaleries : Créez de nouvelles animaleries avec leurs détails comme le nom et l'adresse.

Gérer les Produits : Ajoutez, mettez à jour et supprimez des produits comme de la nourriture pour animaux, des accessoires, etc.

Enregistrer des Animaux : Ajoutez de nouveaux animaux à une animalerie spécifique avec leurs informations détaillées.

Consulter les Animaux : Choisissez une animalerie pour afficher tous les animaux qui y résident.

## Contributions
Les contributions sous forme de suggestions, rapports de bugs et demandes de fonctionnalités sont les bienvenues. Pour contribuer au projet, veuillez ouvrir une issue pour discuter des changements majeurs ou soumettre une pull request directement.

## Auteurs
Ce projet est maintenu par Hamza. Il a été développé dans le cadre d'un projet scolaire.


