import java.util.ArrayList;
import java.util.List;

// Creation de la classe Bibliotheque avec les attributs ci-dessous

public class Bibliotheque {
    private String nom;
    private String adresse;
    private String telephone;
    private String mail;
    private List<Livre> livres;
    private List<Membre> membres;

    // Creation du constructeur de la classe

    public Bibliotheque(String nom, String adresse, String telephone, String mail) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
        this.livres = new ArrayList<>();
        this.membres = new ArrayList<>();
    }

    // Creation des getters et setters et verufication de la validité des données

        public String getNom() {
            return this.nom;
        }
        public void setNom(String nom) {
            if(nom == null) {
                throw new IllegalArgumentException("Le nom de la bibliothèque ne peut pas être vide.");
            }
            this.nom = nom;
        }

        public String getAdresse() {
            return this.adresse;
        }
        public void setAdresse(String adresse) {
            if(adresse == null || adresse.isEmpty()) {
                throw new IllegalArgumentException("L'adresse de la bibliothèque ne peut pas être vide.");
            }
            this.adresse = adresse;
        }

        public String getTelephone() {
            return this.telephone;
        }
        public void setTelephone(String telephone) {
            if(telephone == null || telephone.isEmpty()) {
                throw new IllegalArgumentException("Le téléphone de la bibliothèque ne peut pas être vide.");
            }
            this.telephone = telephone;
        }
        
        public String getMail() {
            return this.mail;
        }
        public void setMail(String mail) {
            if(mail == null || mail.isEmpty()) {
                throw new IllegalArgumentException("Le mail de la bibliothèque ne peut pas être vide.");
            }
            this.mail = mail;
        }

        public List<Livre> getLivres() {
            return new ArrayList<>(livres);
        }
        public void setLivres(List<Livre> livres) {
            if(livres == null || livres.isEmpty()) {
                throw new IllegalArgumentException("La liste des livres ne peut pas être nulle.");
            }
            this.livres = new ArrayList<>(livres);

        }

        public List<Membre> getMembres() {
            return new ArrayList<>(membres);
        }
        public void setMembres(List<Membre> membres) {
            if(membres == null) {
                throw new IllegalArgumentException("La liste des membres ne peut pas être nulle.");
            }
            this.membres = new ArrayList<>(membres);
        }

        // Creation de la méthode pour ajouter un livre et à la bibliothèque

        public void ajouterLivre(Livre livre) {
            if(livre == null) {
                throw new IllegalArgumentException("Le livre ne peut pas être nul.");
            }   
            livres.add(livre);
        }

        // Creation de la méthode pour ajouter un membre à la bibliothèque
        public void ajouterMembre(Membre membre) {
            if(membre == null) {
                throw new IllegalArgumentException("Le membre ne peut pas être nul.");
            }
            membres.add(membre);
        }
        
        // Creation de la méthode pour emprunter un livre
        public void emprunterLivre(Livre livre, Membre membre) {
            if(!membres.contains(membre)){
                throw new MembreNonInscritException();
            }
            if(!livres.contains(livre)){
                throw new LivreNonDisponibleException();
            }
        // Si le livre est disponible et le membre est inscrit, on peut emprunter le livre
            livres.remove(livre);
            membre.emprunterLivre(livre);
            System.out.println("Le livre " + livre.getTitre() + " " + livre.getAuteur() + " a bien été emprunté par " + membre);
        }

        // Creation de la méthode pour retourner un livre

        public void retournerLivre(Livre livre, Membre membre) {
            if(!membres.contains(membre)){
                throw new MembreNonInscritException();
            }
            if(!membre.possedeLivre(livre)){
                throw new LivreNonDisponibleException();
            }
            
            // Si le membre a bien emprunté le livre, on peut le retourner
            membre.retournerLivre(livre);
            livres.add(livre);
            System.out.println("Le livre " + livre.getTitre() + " " + livre.getAuteur() + " a bien été retourné par " + membre);
        }

        //Creation de la méthode pour afficher les livres disponibles dans la bibliothèque

        public void afficherLivresDisponibles() {
            System.out.println("Livres disponibles dans la bibliothèque " + nom + " :");
            for(Livre livre : livres) {
                System.out.println(livre);
            }
        }

        // Creation de la méthode pour afficher les membres de la bibliothèque

        public void afficherMembres() {
            System.out.println("Membres inscrits dans la bibliothèque " + nom + " :");
            for(Membre membre : membres) {
                System.out.println(membre);
            }
        }



        @Override
        public String toString() {
            return "Bibliothèque: " + nom + ", Adresse: " + adresse + ", Téléphone: " + telephone + ", Mail: " + mail + ", Livres: " + livres + ", Membres: " + membres;
        }   

}
