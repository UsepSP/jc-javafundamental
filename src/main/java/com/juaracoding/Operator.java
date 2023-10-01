package com.juaracoding;

public class Operator {
    public static void main(String[] args) {
        //Operator Aritmatika
        int harga = 10000;
        int qty = 5;
        int total = harga * qty;
        System.out.println("Total = " + total);
        int modulus = 7 % 2;
        System.out.println("Modulus = " + modulus);
        modulus++;
        System.out.println("Increment = " + modulus);

        //Operator Penugasan
        int a = 1;
        a = a + 2;
        int b = 10 + 2 * 5;
        int c = (10 + 2) * 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //operator gabungan
        a += b;
        System.out.println(a);

        boolean d = 5 >= 5;
        System.out.println(d);
        int pembagi =0;
        boolean pembagian = pembagi != 0;
        System.out.println(pembagian);
    }
}
