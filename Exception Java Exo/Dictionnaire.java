// L'objectif de cet exercice est de créer un dictionnaire simple en Java, où l'utilisateur peut rechercher la définition d'un mot
// J'ai utilisé une HashMap pour stocker les mots et leurs définitions
// L'utilisateur peut entrer un mot, et le programme affichera la définition correspondante si le mot existe dans le dictionnaire, sinon il affichera un message d'erreur.

import java.util.HashMap;
import java.util.Scanner;

public class Dictionnaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
// création du dictionnaire avec des mots et leurs définitions
        HashMap <String, String>dictionnaire = new HashMap<>();
        dictionnaire.put("courage", "Force morale ; fait d' agir malgré les difficultés, énergie dans l' action, dans une entreprise (s' oppose à paresse, laisser-aller).");
        dictionnaire.put("santé", "Bon état physiologique d'un être vivant, fonctionnement régulier et harmonieux de l'organisme.");
        dictionnaire.put("moment", "Espace de temps limité. ➙ instant. Le moment où un évènement s'est produit.");

// affichage de tous les mots du dictionnaire
        System.out.println("Liste des Mots :");
        for(String i : dictionnaire.keySet()){
            System.out.println("- " + i);
        }

    // demande à l'utilisateur de rechercher un mot
        System.out.println("Rechercher un mot");
        String mot = sc.nextLine().toLowerCase();
        
            if(dictionnaire.containsKey(mot)) {
                System.out.println("Définition : "+ dictionnaire.get(mot));
            }else{
                System.out.println("Erreur ce mot n'existe pas dans le dictionnaire");
            } 
        sc.close();
     }
}
