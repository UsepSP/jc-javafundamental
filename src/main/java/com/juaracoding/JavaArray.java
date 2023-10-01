package com.juaracoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {

        //cara 1
        int [] num = {3, 6, 3, 1, 6, 3, 4, 1};
        System.out.println(num[0]);
        System.out.println(num[2]);
        System.out.println(num[5]);
        System.out.println("Total elemen = "+num.length);

        // cara 2
        int angka [] = new int[4];
        angka [0]= 3;
        angka [1]= 6;
        angka [2]= 3;
        angka [3]= 6;
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka[3]);

        //looping array
        String [] mobil = {"Volvo","BMW", "Ford", "Mazda"};
        for (int i = 0; i < mobil.length; i++) {
            System.out.println(mobil[i]);
        }
        //for each
        System.out.println();
        for (String data:mobil){
            System.out.println(data);
        }

        int [][] number = {{1,2,3,4,5},{6,7,8}};
        System.out.println(number[0][1]); //baris 1, kolom 2
        System.out.println(number[1][1]); //baris 2, kolom 2
        System.out.println(number[1][2]); //baris 2, kolom 3

        //Implementasikan input Scanner menggunakan array 1 dimensi
        Scanner input = new Scanner(System.in);
//        int jumlahData = 5;
//        String [] firstName = new  String[jumlahData];
//        for (int i = 0; i < jumlahData; i++) {
//            System.out.print("Masukan First Name ke-"+ (i+1)+": ");
//            firstName[i] = input.nextLine();
//        }
//        for (String data:firstName){
//            System.out.println(data);
//        }
        //buatkan darray data buah

//        String []buah = {"apel","jeruk", "nanas", "pisang", "semangka"};
//        System.out.print("Cari data buah = ");
//        String cari = input.nextLine();
//        boolean ditemukan = false;
//        int index = 0;
//
//        for (int i = 0; i < buah.length; i++) {
//            if (buah[i].equalsIgnoreCase(cari)){
//                ditemukan = true;
//                index = i;
//                break;
//            }
//
//        }
//        if (ditemukan){
//            System.out.println("Buah " +cari+ " ditemukan pada index ke-" +index);
//        }else {
//            System.out.println("Buah " +cari+ " tidak ditemukan pada array");
//        }

        //sorting data nama buah, cara tercepat dengan Arrays.sort (buah)
        String buah[] = {"apel","jeruk", "nanas", "pisang", "semangka"};
        Arrays.sort(buah);
        System.out.println("Hasi sort nama buah :");
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }
        //buatkan program cari kata terpanjang dari data buah


        }


}

