import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// création d'un scanner pour lire les entrées de l'utilisateur et d'une liste de contact pour stocker les contacts
        Scanner sc = new Scanner(System.in);
        ListContact ls = new ListContact();


    while (true) {
// affichage du menu pour l'utilisateur

            System.out.println();
            System.out.println("1. pour ajouter un contact");
            System.out.println("2. pour afficher la liste de contact");
            System.out.println("3. pour supprimer un contact");
            System.out.println("4. pour trouver un contact");
            System.out.println("6. pour quitter");
            
    // lecture du choix de l'utilisateur    

            int choix = sc.nextInt();
            sc.nextLine();

        switch (choix) {
   
            case 1:
                System.out.println("Ajouter un contact");
                System.out.println("Entrez le nom du contact : ");
                String nom = sc.nextLine();
            
                System.out.println("Entrez le numéro du contact : ");
                String numero = sc.nextLine();

                ls.addContact(new Contact(nom, numero));
                ls.saveToFile("file.txt");
                break;
            case 2:
                System.out.println("Afficher la liste de contact");
                ls.afficher();
                break;
            case 3:
                System.out.println("Supprimer un contact");
                System.out.println("Entrez le nom du contact à supprimer : ");
                String nomDelete = sc.nextLine();
                
                ls.deleteContact(nomDelete);
                ls.saveToFile("file.txt");
                break;
            case 4:
                System.out.println("Trouver un contact");
                System.out.println("Entrez le nom du contact à trouver : ");

                String nomFind = sc.nextLine();
                sc.nextLine();
                ls.findContact(nomFind);
                break; 

            case 6:
                System.out.println("Au revoir !");
                return;

            default:
                System.out.println("Choix invalide");
        }
     
    }
        
    }
  
}
