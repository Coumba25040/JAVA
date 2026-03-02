import java.util.Scanner;


// L'objectif de cet exercice est de créer un programme qui demande à l'utilisateur les noms et les scores de 5 joueurs, puis affiche la liste des joueurs avec leurs scores, le joueur ayant le score le plus élevé, la moyenne des scores, et le nombre de joueurs ayant un score supérieur à 50.

public class GestionnaireJeux {
    public static void main(String[] args) {
        String[] joueurs = new String[5];
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);


    // boucle pour remplir les tableaux avec les noms et les scores des joueurs
        for(int i = 0; i < 5; i++){
            sc.nextLine();
            System.out.println("Ajoutez un joueur");
            joueurs[i] = sc.nextLine();
            System.out.println("Ajoutez un score");
            scores[i] = sc.nextInt();
        }

    // affichage de la liste des joueurs avec leurs scores
        System.out.println("LISTE JOUEURS");
        for(int i = 0; i < 5; i++){
            System.out.println("Joueur : " + joueurs[i] + " score : " + scores[i]);
        }


    // recherche du joueur ayant le score le plus élevé
        int scoreMax = scores[0];
        int indexMax = 0;

        for(int i = 1; i < 5; i++){
            if(scores[i] > scoreMax){
                scoreMax = scores[i];
                indexMax = i;
            }
        }
        System.out.println("Le joueur ayant le score le plus élevé est : " + joueurs[indexMax] + " score : " + scoreMax );


    // calcul de la moyenne des scores
        double moyenne;
        double somme = 0;
        int length = scores.length;

        for(int score : scores){
            somme += score;

        }
        moyenne = somme / length;
        System.out.println("La moyenne est de : " + moyenne);


        // comptage du nombre de joueurs ayant un score supérieur à 50

        int compteur  = 0;

        for(int i = 0; i < 5; i++){
           
            if (scores[i] > 50) {
                compteur++;
            }
        }
        System.out.println("Il y'a " + compteur + " joueurs ayant un score supérieur à 50");
        
        
    }
}
