package tris;

import java.util.*; // pour Random 

public class BubbleSort {

    public static int[] init() {
        int tab[] = new int[10];
        // fill the array with random values
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            // generate integers between 0 and 49 included
            tab[i] = rand.nextInt(50);
        }
        String stringTab = Arrays.toString(tab);
        System.out.println(stringTab);
        return tab;
    }

    public static void printArray(int[] tab) {
        String stringTab = Arrays.toString(tab);
        System.out.println(stringTab);
    }

    public static int[] sorting() {
        int[] tab = init();
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
            printArray(tab);
            n--;
        }
        return tab;
    }

    public static void main(String args[]) {
        System.out.println("This is the Bubble Sort.");
        sorting();
    }
}
