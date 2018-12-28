package com.company.euclides;

public class Euclid {

    public static void main(String[] args) {

        int c = najwWspDziel(48, 32);
        System.out.println(c);
        int d = najWspDzielWer2(48, 32);
        System.out.println(d);
    }

    static int najwWspDziel(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static int najWspDzielWer2(int a, int b) {

        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
