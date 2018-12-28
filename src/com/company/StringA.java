package com.company;

//Napisz metodę, która sprawdzi czy podany wyraz jest palindromem

public class StringA {

    public static void main(String[] args) {

        String word1 = "kajak";

        boolean isOk =isWordPalind(word1);
        System.out.println(isOk);
    }

    public static boolean isWordPalind(String word) {


        char[] wordFragmented = word.toCharArray();

        char[] wordBackwards = new char[wordFragmented.length];

        int a = 0;
        for (int i = word.length() - 1; i >= 0; i--) {

            wordBackwards[a] = wordFragmented[i];
            a++;
        }
        // System.out.println(wordBackwards);
        boolean isOk = true;
        for (int i = 0; i < word.length(); i++) {

            if (wordFragmented[i] != wordBackwards[i]) {
                isOk = false;
            }
        }
        return isOk;
    }
}

