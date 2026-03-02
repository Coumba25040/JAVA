// L'objectif de cet exercice est de créer une liste de courses à partir des entrées de l'utilisateur.
// L'utilisateur doit d'abord indiquer combien d'articles il souhaite ajouter à la liste,
// puis entrer les noms de ces articles un par un, la liste de courses doit être affichée à l'écran.


import java.util.ArrayList;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // creation de la liste de courses
        ArrayList<String>courses = new ArrayList<>();

    // demande à l'utilisateur combien d'articles il souhaite ajouter à la liste

        System.out.println("Combien d'articles souhaitez vous ajouter à la liste ?");
        int nbArticles = sc.nextInt();
       
        sc.nextLine();
        
    // boucle pour ajouter les articles à la liste
        for(int i = 0; i < nbArticles; i++){
            System.out.println("Ajoutez un article");
            String article = sc.nextLine();
            courses.add(article);
        }
        sc.close();

    // affichage de la liste de courses
        System.out.println("--------------- LISTE ---------------");
        for (String val : courses) {
            System.out.println("- " + val);
        }
        
    }   
}
