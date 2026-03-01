
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// creation de la classe ListContact qui contient une liste de contact et les méthodes pour gérer les contacts

public class ListContact {
    private List<Contact> listContact;


// constructeur de la classe ListContact
    public ListContact(){
        this.listContact = new ArrayList<>();
    }


// création des getters et setters pour la liste de contact
    public List<Contact> getListContact(){
        return new ArrayList<>(listContact);
    }
    public void setListContact(List<Contact> listContact){
        this.listContact = new ArrayList<>(listContact);
    }

// création de la méthode pour ajouter un contact à la liste de contact

    public void addContact(Contact contact){
            listContact.add(contact);
     }

// création de la méthode pour afficher la liste de contact

     public void afficher(){
        for(Contact contact : listContact){
            System.out.println(contact);
        }
    }

// création de la méthode pour supprimer un contact de la liste de contact

    public void deleteContact(String nom){
        Iterator <Contact> it =  listContact.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if(contact.getNom().toLowerCase().contains(nom.toLowerCase())) {
                it.remove();
                System.out.println("Nous avons supprimé le contact : " + contact);
            }
        }
    }
    

    //création de la méthode pour trouver un contact 
    public void findContact(String str){
        boolean find = false;
        for(Contact contact: listContact){
           
            if(contact.getNom().toLowerCase().contains(str.toLowerCase())) {
              System.out.println("Nous avons trouvé " + contact); 
              find = true;  
            }
        }
            if(!find){
                System.out.println("Aucun contact");
            }
        }

    // création de la méthode pour sauvegarder la liste de contact dans un fichier texte

        public void saveToFile(String fileName){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                for(Contact contact : listContact){
                    bw.write(contact.toString());
                    bw.newLine();
                }
            }
            catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la sauvegarde du fichier.");
            e.printStackTrace();
        }  
        }

    }

    


