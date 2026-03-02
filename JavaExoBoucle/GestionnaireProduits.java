import java.util.Scanner;

public class GestionnaireProduits {
    public static void main(String[] args) {

        System.out.println("Ajoutez le nombre de produits : ");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        
        String[] produits = new String[nombre];
        double[] prix = new double[nombre];

        for(int i = 0; i < nombre; i++){
            System.out.println("Ajoutez un produit");
            sc.nextLine();
            produits[i] = sc.nextLine();

            System.out.println("Ajoutez un prix");
            prix[i] = sc.nextDouble();
        }
        sc.close();


        System.out.println("LISTE DES PRODUITS");
        for(int i = 0; i < nombre; i++){ 
            System.out.println("Produit : " + produits[i] + ", " + prix[i] + " €");
        }

        // Rechercher le prix maximum et minimum 

        double max = prix[0];
        int indexMax = 0;

        double min = prix[0];
        int indexMin = 0;

        for(int i = 1; i < nombre; i++){
            
            if(prix[i] > max){
                max = prix[i];
                indexMax = i;
                   
            }if(prix[i] < min) {
                min = prix[i];
                indexMin = i;
            }         
        }
        System.out.println("Le produit le moins cher est : " + produits[indexMin] + " " + min + " €");
        System.out.println("Le produit le plus cher est : " + produits[indexMax] + " " + max + " €");   
    }
}
