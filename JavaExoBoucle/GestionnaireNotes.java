import java.util.Scanner;

public class GestionnaireNotes {

// L'objectif de cet exercice est de créer un programme qui demande à l'utilisateur d'entrer le nombre d'étudiants, puis pour chaque étudiant, son nom et sa note. Le programme doit ensuite afficher la liste des étudiants avec leurs notes, trier les étudiants par ordre décroissant de note, afficher le classement, calculer la moyenne de la classe, et afficher l'eleve ayant la meilleure note et l'élève ayant la note la plus basse.


    public static void main(String[] args) {
        System.out.println("Combien de notes souhaitez-vous entrer");
        Scanner sc = new Scanner(System.in);

// création de tableaux pour stocker les noms et les notes des étudiants

        int nombre = sc.nextInt();
        String[] etudiants = new String[nombre];
        double[] notes = new double[nombre];

// boucle pour remplir les tableaux avec les noms et les notes des étudiants

        for(int i = 0; i < nombre; i++){
            System.out.println("Entrez un étudiant");
            sc.nextLine();
            etudiants[i] = sc.nextLine();
            System.out.println("Entre une note");
            notes[i] = sc.nextDouble();
        }

// affichage de la liste des étudiants avec leurs notes
        for(int i = 0; i < nombre; i++){
            System.out.println(etudiants[i] + " " + notes[i]);
        }

// tri à bulles pour trier les étudiants par ordre décroissant de note    
        System.out.println("CLASSEMENT");
        for(int i = 0; i < nombre; i++){
     
            for(int j = 0; j < nombre -1; j++){
                if(notes[j] < notes[j+1]){
                    double tempNotes = notes[j];
                    notes[j] = notes[j+1];
                    notes[j+1] = tempNotes;

                    String tempEtudiant = etudiants[j];
                    etudiants[j] = etudiants[j+1];
                    etudiants[j+1] = tempEtudiant;

                }
               
            }
        }

    // affichage du classement
        for(int i = 0; i < nombre; i++){
            System.out.println((i+1) + " Etudiant " + etudiants[i] + " Note : " + notes[i]);
        }
        System.out.println("L'élève ayant la meilleure note est " + etudiants[0] + " avec une note de " + notes[0]);
            System.out.println("L'élève ayant la note la plus basse est " + etudiants[nombre -1] + " avec une note de " + notes[nombre -1]);


    // calcul de la moyenne de la classe
        double moyenne;
        double som = 0;

        for(double note : notes){
            som += note;
        }
        moyenne = som / notes.length;
        System.out.println("LA MOYENNE DE LA CLASSE EST " + moyenne);


       

          
    }
}
