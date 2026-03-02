# GESTIONNAIRE DE CONTACTS JAVA

Un petit projet Java permettant de gérer une liste de contacts directement depuis le terminal. Ce programme permet d'ajouter, d'afficher, de rechercher et de supprimer des contacts, tout en sauvegardant les données dans un fichier texte.

## Fonctionnalités principales

* **Ajout de contacts** : Enregistrez un nom et un numéro de téléphone.
* **Affichage** : Listez tous les contacts enregistrés dans la mémoire.
* **Recherche** : Trouvez rapidement un contact par son nom.
* **Suppression** : Retirez un contact de votre liste.
* **Sauvegarde** : Exportation automatique vers un fichier `file.txt`.

## Structure du Code

Le projet est découpé en trois fichiers sources :
1.  **Contact.java** : Le modèle de donnée.
2.  **ListContact.java** : La logique de gestion de la liste.
3.  **Main.java** : L'interface utilisateur avec le menu.

## Installation et Lancement

Pour tester le projet sur votre machine :

### 1. Compiler les fichiers :
```bash
javac *.java