package com.company;

public class Arrays {

    public static void main(String[] args) {

        int tab[] = {1, 2, 3, 4, 5};
        int tab1[] = {1, 1, 1};

        int differ = getNumbArg(tab);

        System.out.println(differ);
    }

    public static int getNumbArg(int[] tab) {

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
        }
        return Math.abs(sumEven - sumOdd);
    }
}
