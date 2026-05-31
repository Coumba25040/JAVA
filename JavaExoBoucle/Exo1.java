//L'objectif de cet exercice est de créer un programme qui demande à l'utilisateur un nombres et afficher si le nombre est pair ou impair, et compte le nombre de nombres impairs.


import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// demande à l'utilisateur combien de nombres il souhaite ajouter à la liste

        System.out.println("Combien de nombres souhaitez-vous ajouter ?");
        int nombre = sc.nextInt();
        int[] tab = new int[nombre];


// boucle pour remplir la liste avec les nombres entrés par l'utilisateur
        for(int i = 0; i < tab.length; i++){
            System.out.println("Ajoutez un nombre");

            tab[i] = sc.nextInt();
            
        }
        sc.close();

    // affichage de la liste des nombres entrés par l'utilisateur
        System.out.println("LISTE");
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

    // affichage de chaque nombre et indication s'il est pair ou impair, et comptage du nombre de nombres impairs
        int compteur = 0;
        System.out.println("LISTE DES NOMBRES PAIRS ET IMPAIRS");
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                System.out.println(tab[i] + " est pair ");
            }else{
                System.out.println(tab[i] + " est impair");
                compteur++;
            }  
        }
        System.out.println("Il y a " + compteur + " nombres impairs");
    }

}
