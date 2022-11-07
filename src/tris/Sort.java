package tris;

import java.util.*;

public class Sort {

    public static void BubbleSort(int[] tab) {
        int n = tab.length;
        while (n > 0) {
            for (int i = 1; i < tab.length; i++) {
                if (tab[i] < tab[i - 1]) {
                    int temp;
                    temp = tab[i];
                    tab[i] = tab[i - 1];
                    tab[i - 1] = temp;
                }
            }
            n--;
            System.out.println(Arrays.toString(tab));
        }
    }

    public static List<Integer> InsertionSort(int[] tab) {
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

    public static void main(String[] args) {
        System.out.println("This is the Bubble Sort :");
        int[] tab = random_integers();
        System.out.println("Initial value of tab : " + Arrays.toString(tab));
        BubbleSort(tab);
        System.out.println("End value of tab : " + Arrays.toString(tab));

        System.out.println("This is the Insertion Sort :");
        tab = random_integers();
        System.out.println("Initial value of tab : " + Arrays.toString(tab));
        List<Integer> tab_copy = InsertionSort(tab);
        System.out.println("End value of tab : " + Arrays.toString(tab_copy.toArray()));
    }

    private static int[] random_integers() {
        int tab[] = new int[20];
        // fill the array with random values
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            // generate integers between 0 and 49 included
            tab[i] = rand.nextInt(50);
        }
        return tab;
    }
}
