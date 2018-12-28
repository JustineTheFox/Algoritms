package com.company.euclides;

public class BinarySearch {

    public static void main(String[] args) {

        int [] tab = {1,2,3,4,5,6,7,8,9};
        int n = 7;

        int guess = getNumber(tab,n);

        System.out.println(guess);
    }

    static int getNumber(int[] tab, int n) {

        int left = tab[0];
        int right = tab[tab.length - 1];
        int middle;

        while (right >= left) {            // dopoki prawa strona jest wieksza lub rowna lewej
            middle = (left + right) / 2;    // srodek to suma prawej i lewej podzielone przez 2
            if (tab[middle] < n) {          // jesli ustrzelona liczba czyli tab[middle] jest mniejsza od szukanej n to
                left = middle + 1;          // przesuwamy sie w tabeli - teraz indeks lewej strony jest rowny [middle +1]
            } else if (tab[middle] > n){    // przeciwnie jesli ustrzelona liczba jest wieksza od szukanej n to
                    right = middle -1;      // przesuwamy sie w prawo po tabeli -indeks prawej strony bedzie rowny [middle -1]
            }
            else return middle;             // w przeciwnym wypadku middle - to jest szukana liczba i zwroc ja jako wynik!
            }
            return n;
        }
    }
