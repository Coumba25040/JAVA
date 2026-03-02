# 📚 Projet Bibliothèque en Java

## Description

Ce projet est une **mini-application de gestion d’une bibliothèque**.  
Il permet de créer une bibliothèque, d’ajouter des membres et des livres, et de gérer les emprunts et retours de livres.  

Le projet est écrit en **Java** et utilise la programmation orientée objet (POO) avec :  

- Classes `Bibliotheque`, `Livre`, `Membre`  
- Gestion des listes de livres et membres  
- Méthodes pour emprunter et retourner des livres  
- Exceptions pour gérer les erreurs (livre non disponible, membre non inscrit)


## Fonctionnalités

1. Créer une bibliothèque avec nom, adresse, téléphone et mail  
2. Créer des membres avec nom, prénom, mail, adresse et téléphone  
3. Créer des livres avec titre, auteur, ISBN et résumé  
4. Ajouter des livres et membres à la bibliothèque  
5. Emprunter un livre (vérifie que le membre est inscrit et que le livre est disponible)  
6. Retourner un livre  
7. Afficher les livres disponibles  
8. Afficher les membres inscrits  



## Structure des classes

| Classe          | Description |
|-----------------|-------------|
| `Bibliotheque`  | Contient les listes de livres et de membres, méthodes pour ajouter, emprunter, retourner et afficher |
| `Livre`         | Représente un livre avec titre, auteur, ISBN et résumé |
| `Membre`        | Représente un membre avec nom, prénom, mail, adresse, téléphone et liste de livres empruntés |
| `Main`          | Classe principale pour tester le fonctionnement du projet |

---

## Exemple d’utilisation

```java
Bibliotheque bibliotheque = new Bibliotheque(
    "Bibliothèque Municipale",
    "123 Rue Principale",
    "0123456789",
    "bibliotheque@exemple.com"
);

Membre m1 = new Membre(
    "LALI",
    "Nana",
    "nana.lali@gmail.com",
    "9 rue d'Arpajon",
    "0712345678"
);

Livre l1 = new Livre(
    "Le Petit Prince",
    "Antoine de Saint-Exupéry",
    "978-0156012195",
    "Un pilote rencontre un petit prince venu d'une autre planète."
);

bibliotheque.ajouterMembre(m1);
bibliotheque.ajouterLivre(l1);

bibliotheque.emprunterLivre(l1, m1);
bibliotheque.afficherLivresDisponibles();
bibliotheque.retournerLivre(l1, m1);
bibliotheque.afficherLivresDisponibles();