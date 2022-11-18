package tris;

import java.util.*;

public class InsertionSort {
    public static List<Integer> sorting(int[] tab) {
        System.out.println(tab.toString());
        List<Integer> tab_copy = new ArrayList<Integer>();
        tab_copy.add(tab[0]);
        for (int i = 1; i < tab.length; i++) {
            int j = 0;
            while (j < tab_copy.size() && tab[i] > tab_copy.get(j)) {
                j++;
            }
            if (j < tab_copy.size()) {
                tab_copy.add(j, tab[i]);
            } else {
                tab_copy.add(tab[i]);
            }
            System.out.println(Arrays.toString(tab_copy.toArray()));
        }
        return tab_copy;
    }

    public static void main(String args[]) {
        System.out.println("This is the Insertion Sort");
        int[] tab = { 4, 5, 7, 8, 10, 1, 2, 6, 3, 9 };
        sorting(tab);
        /* Pour l'exercice, l'InsertionSort fonctionne.
         * Mais pour utilisation en production ou en pratique,
         * il faudrait choisir un type uniforme entre les fonctions.
         * Ici, tab est en int[] et tab_copy une collection en List<Integer>.
         * Il faudrait donc uniformiser cela lors de son utilisation en production.
         * A également demander aux profs pour avoir leur avis.
         */
    }
}
