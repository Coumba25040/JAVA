public class Exo3 {
    public static void main(String[] args) {
        // Exercice 3 : Échange d'éléments dans un tableau

// Ce que ça travaille : Échange d'éléments avec variable temporaire

        int[] tab = {10, 20, 30, 40, 50};

// échange du premier et du dernier élément du tableau
        int temp = tab[0];
        tab[0] = tab[4];
        tab[4] = temp;
// échange du deuxième et du quatrième élément du tableau
        int temp2 = tab[1];
            tab[1] = tab[3];
            tab[3] = temp2;
           

        
        for(int val : tab){
            System.out.println(val);
        }
    }
}
