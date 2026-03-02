import java.util.ArrayList;
import java.util.List;

// Creation de la classe Membre avec les attributs ci-dessous

public class Membre {
    private String nom;
    private String prenom;
    private String mail;
    private String adresse;
    private String telephone;
    private List<Livre>livresEmpruntes;

   
    // Creation du constructeur de la classe

    
    public Membre(String nom, String prenom, String mail, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;
        this.telephone = telephone;
        this.livresEmpruntes = new ArrayList<>();
        
    }

    // Creation des getters et setters et verufication de la validité des données

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if(nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Nom invalide");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if(prenom == null || prenom.isEmpty()) {
            throw new IllegalArgumentException("Prénom invalide");
        }
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail == null || mail.isEmpty() || !mail.contains("@")) {
            throw new IllegalArgumentException("Le mail doit être valide.");
        }
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        if(adresse == null || adresse.isEmpty()) {
            throw new IllegalArgumentException("Adresse invalide");
        }
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if(telephone == null || telephone.isEmpty()) {
            throw new IllegalArgumentException("Telephone invalide");
        }
        this.telephone = telephone;
    }


    public List<Livre> getLivresEmpruntes() {
        return new ArrayList<>(livresEmpruntes);
    }


    // Creation des méthodes pour emprunter un livre

    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    // Creation de la méthode pour retourner un livre

    public void retournerLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    // Creation de la méthode pour vérifier si le membre possède un livre emprunté

    public boolean possedeLivre(Livre livre) {
        return livresEmpruntes.contains(livre);
    }

    // Creation de la méthode toString pour afficher les informations du membre

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom: " + prenom + ", Mail: " + mail + ", Adresse: " + adresse + ", Téléphone: " + telephone + ", liste de livres empruntés : " + livresEmpruntes;
    }
   

}
