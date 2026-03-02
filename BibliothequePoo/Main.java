public class Main {
    public static void main(String[] args) {
        // Création de la bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque("Bibliothèque Municipale", "123 Rue Principale", "0123456789", "bibliotheque@exemple.com");
        System.out.println("Bibliothèque créée : " + bibliotheque.getNom());
        // Création de membres
        Membre m1 = new Membre("LALI", "Nana", "nana.lali@gmail.com", "9 rue d'Arpajon ", "0712345678");
        System.out.println("Ajout du Membre : " + m1.getPrenom() + " " + m1.getNom());
        
        Livre l1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "978-0156012195", "Un pilote rencontre un petit prince venu d'une autre planète.");
        System.out.println("Livre créé : " + l1.getTitre() + " par " + l1.getAuteur());

        bibliotheque.ajouterLivre(l1);
        bibliotheque.ajouterMembre(m1);
        bibliotheque.emprunterLivre(l1, m1);
        bibliotheque.afficherMembres();
        bibliotheque.retournerLivre(l1, m1);  
    }
}
