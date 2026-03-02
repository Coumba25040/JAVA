// L'objectif de cet exercice est de créer une liste de contacts, où l'utilisateur peut entrer les noms et les numéros de téléphone de ses contacts, puis rechercher un contact par son nom et afficher le numéro de téléphone correspondant. De plus, le programme affichera le contact ayant le plus long nom.


import java.util.Scanner;

public class ContactExo {
    public static void main(String[] args) {

    // création de tableaux pour stocker les noms et les numéros de téléphone des contacts
        String[] noms = new String[3];
        int[] numeros = new int[3];

        Scanner sc = new Scanner(System.in);

    // boucle pour remplir les tableaux avec les noms et les numéros de téléphone des contacts
        for(int i = 0; i < 3; i++){
            System.out.println("Entrez un nom");
            noms[i] = sc.nextLine();
            
            
            System.out.println("Entrez un numéro de téléphone");
            numeros[i] = sc.nextInt();
            sc.nextLine(); 
        }

    // affichage de la liste des contacts
        System.out.println("LISTE DES CONTACTS");
        for(int i = 0; i < 3; i++){
            System.out.println("Nom : " + noms[i] + " Numéro : " + numeros[i] );
        }

    // recherche d'un contact par son nom et affichage du numéro de téléphone correspondant
        System.out.println("NOM RECHERCHE");
        String nomRecherche = sc.next();; 
        for(int i = 0; i < 3; i++){ 
            
            if (noms[i].equals(nomRecherche)) {
                System.out.println("Nom : " + nomRecherche + " Numéro : " + numeros[i] );
                break;

            }
        }


    // affichage du contact ayant le plus long nom
    
        int maxNom = noms[0].length();
        int maxIndex = 0;

        for(int i = 1; i < 3; i++){
            if(noms[i].length() > maxNom){
                maxNom = noms[i].length();
                maxIndex = i;
              
            }
            
        }
        System.out.println("Le contact ayant le plus long nom est " + noms[maxIndex] + " avec " + maxNom + " caractères ");


    }
}
