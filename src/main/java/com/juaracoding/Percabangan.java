package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        if (true) ;
        {
            System.out.println("Statement IF");
        }
        int num = 7;
        if (num > 2) {
            System.out.println("Bilangan " + num + " lebih besar dari 2");

        } else {
            System.out.println("Bilangan " + num + " tidak lebih besar dari 2");
        }
        if (num % 2 == 0) { // 7 % 2 = 1 == 0 (false)
            System.out.println("Bilangan tersebut genap");
        } else {
            System.out.println("Bilangan tersebut ganjil");
        }
        //if majemuk
        char size = 'M';
        if (size == 'S') {
            System.out.println("Ukuran Baju Kecil");
        } else if (size == 'M') {
            System.out.println("Ukuran Baju Sedang");
        } else if (size == 'L') {
            System.out.println("Ukuran Baju Besar");
        } else {
            System.out.println("Tidak ada ukuran baju tersebut");
        }

        //buatkan if majemuk tentang predikat nilai
        int nilai = -2;
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 75 && nilai <= 90) {
            System.out.println("B");
        } else if (nilai >= 60 && nilai <= 75) {
            System.out.println("C");
        } else if (nilai >= 0 && nilai <= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        int platNomor = 1234;
        int tanggal = 20;
        String keterangan = "bisa lewat Jalan Soekarno";
        if (tanggal % 2 == 0) {
            if (platNomor % 2 == 0) {
                System.out.println("Tanggal dan Plat Nomor Genap, " + keterangan);
            } else {
                System.out.println("Tanggal Genap Tetapi Plat Nomor ganjil, tidak " + keterangan);
            }
        }else{
            if (platNomor % 2 == 1) {
                System.out.println("Tanggal dan Plat Nomor Ganjil " + keterangan);
            } else {
                System.out.println("Tanggl Ganji Plat Nomor Genap " + keterangan);
            }
        }

        //kondisi if menggunakan sebuah function di string
        String warna = "Biru";
        if (warna.equalsIgnoreCase("biru"))
            System.out.println("Warna Baju Biru");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Pilihan Menu :");
        int pilih = scanner.nextInt();
        switch (pilih){
            case 1:
                System.out.println("1. Tampilkan data");
                break;
            case 2:
                System.out.println("2. Tambah data");
                break;
            case 3:
                System.out.println("3. Perbaharui data");
                break;
            case 4:
                System.out.println("4. Hapus data");
                break;
            default :
                System.out.println("Invalid Input");
        }
    }


}