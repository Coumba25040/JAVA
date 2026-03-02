
// creation de la classe Livre avec les attributs ci-dessous


public class Livre {
    private final String titre;
    private final String auteur;
    private final String isbn;
    private final String resume;
    
// Creation du constructeur de la classe

    public Livre(String titre, String auteur, String isbn, String resume) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.resume = resume;
    }

    // Creation des getters pour les attributs de la classe
    
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return this.auteur; 
    }
    public String getIsbn() {
        return this.isbn;
    }
    public String getResume() {
        return this.resume;
    }


// Creation de la méthode toString pour afficher les informations du livre

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Résumé: " + resume;
    }
    
}