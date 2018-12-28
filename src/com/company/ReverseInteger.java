package com.company;

// napisz metodę ktora odwroci zadana liczbę

public class ReverseInteger {

    public static void main(String[] args) {

        int number = 12345;
        int reverse = makeReverseInt(number);
        System.out.println(reverse);
    }

    public static int makeReverseInt(int numberToReverse) {

        int numberToRev = 12345;

        int powOf10 = 10000;
        int revInteger =0;

        while (numberToRev != 0) {

                int separate = numberToRev % 10;

                int middleNumb = separate * powOf10;

                revInteger = middleNumb + revInteger;

            numberToRev /= 10;
            powOf10 = powOf10 / 10;
        }
        return revInteger;
    }
}

