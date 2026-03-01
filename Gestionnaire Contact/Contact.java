// création de la classe contact

public class Contact {
    private String nom;
    private String numero;

// constructeur de la classe contact
    public Contact(String nom, String numero){
        this.nom = nom;
        this.numero = numero;
    }

    // création des getters et setters 
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){

        if(nom == null || nom.isEmpty()){
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }

        this.nom = nom;
    }

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        if(numero == null || numero.isEmpty()){
            throw new IllegalArgumentException("Le numéro ne peut pas être vide");
        }
        
        this.numero = numero;
    }

    // création de la méthode toString pour afficher le contact
    @Override
    public String toString(){
        return "Nom : " + nom + ", Numéro : " + numero;
    }
}

