package com.juaracoding;

public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        //menampilkan deret angka
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i < 10 ; i++) {
            System.out.print(i);
            i++;
        }

        System.out.println();
        for (int i = 1; i <10 ; i+=2) {
            System.out.print(i);
            
        }

        //buat pola kotak
        //nested for
        System.out.println();
        int sisi = 7;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //membuat pola segitiga
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <=i ; j++) { //1 <=1 1 (true)
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= sisi; i++) {
            for (int j = sisi; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
            
        }


        int x = 0;
        while ( x < 5){ //5 < 5 (false)
            System.out.print(x);
            x++;
        }

        System.out.println();
        //break and continue
        for (int i = 1; i <=10; i++) {
            if(i==5){
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        //break and continue
        for (int i = 1; i <=10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i);
        }


    }
}