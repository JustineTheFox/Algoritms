package com.company.euclides;

public class BubbleSort {

    public static void main(String[] args) {

        int tab[] = {5, 7, 2, 5, 1, 8, 2, 6, 3};

        int[] sorted = getSort(tab);

        for (int i = 0; i < sorted.length ; i++) {
            System.out.print(sorted[i] + ",");
        }
    }

    static int[] getSort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                int current;
                if (tab[j] > tab[j + 1]) {
                    current = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = current;
                }
            }
        }
        return tab;
    }
}
