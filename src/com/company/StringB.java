package com.company;

//Napisz metodę, która sprawdza czy dane dwa słowa są anagramami.

import java.util.Arrays;


public class StringB {

    public static void main(String[] args) {

        String word1 = "areoz";
        String word2 = "burza";
        boolean isOk = isWordAnagram(word1, word2);
        System.out.println(isOk);
    }

    public static boolean isWordAnagram(String word1, String word2) {
        boolean isOk = true;

        if (word1.length() != word2.length()) {
            isOk = false;
        } else {

            char[] wordFragmOne = word1.toCharArray();

            char[] wordFragmTwo = word2.toCharArray();

            Arrays.sort(wordFragmOne);
            //System.out.println(wordFragmOne);
            Arrays.sort(wordFragmTwo);
            // System.out.println(wordFragmTwo);

            isOk = Arrays.equals(wordFragmOne, wordFragmTwo);

        }
        return isOk;
    }
}

