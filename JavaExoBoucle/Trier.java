import java.util.Scanner;

public class Trier {

    // L'objectif de cet exercice est de créer un programme qui demande à l'utilisateur d'entrer 3 nombres, puis trie ces nombres dans l'ordre croissant et les affiche à l'écran.
    public static void main(String[] args) {
        System.out.println("Entrez 3 nombres");
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[3];

    // boucle pour remplir le tableau avec les nombres entrés par l'utilisateur
        for(int i = 0; i < tab.length; i++){
            System.out.println("Ajoutez un nombre");
            tab[i] = sc.nextInt();
        }
        sc.close();

        // tri à bulles 
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length -1; j++){
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                     tab[j] = tab[j+1]; 
                     tab[j+1] = temp; 
            }
            
            }
        }

        // affichage du tableau trié affichage du tableau trié
        System.out.println("LISTE TRIEE");
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}
