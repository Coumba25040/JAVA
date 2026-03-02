// L'objectif de cet exercice est de créer une liste de nombres et d'utiliser un itérateur pour parcourir cette liste et afficher si chaque nombre est pair ou impair.

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {

        // création de la liste de nombres
        ArrayList<Integer>number = new ArrayList<>();
        number.add(4);
        number.add(3);
        number.add(1);

        // utilisation d'un itérateur pour parcourir la liste
        Iterator<Integer> it = number.iterator();

        // affichage de chaque nombre et indication s'il est pair ou impair
        System.out.println("Liste : ");
        while (it.hasNext()) {
            int nb = it.next();
            if(nb % 2 == 0){
                System.out.println(nb + " est pair ");
            }else{
                System.out.println(nb + " est impair");
            }
        }
    }
}
