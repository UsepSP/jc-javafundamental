package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
        System.out.println("Informasi Akun");
        String nama = "Usep Saipul Helmi";
        System.out.println("Nama\t\t\t: " + nama);
        int id = 16020067;
        System.out.println("Nomor Pelamar\t: " + id);
        byte beratBadan = 55;
        System.out.println("Berat \t\t\t: " + beratBadan);
        Float tinggiBadan = 165.5f;
        System.out.println("Tinggi Badan\t: " + tinggiBadan);
        char golonganDarah = 'B';
        System.out.println("Golongan Darah\t: " + golonganDarah);
        boolean isActive = true;
        System.out.println("Status Pelajar\t: " + isActive);
        System.out.println("Url Profil \t\t: " + "F:\\Desain\\CDR\\Cetak\\2022");

        //Implicit
        int price = 80000;
        double dataPrice = price;
        System.out.println(dataPrice);

        char data = 'W';
        long longData = data;
        System.out.println(longData);

        //Explicit
        long l = 9223372036854775000l;
        int i = (int) l;
        System.out.println(i);

        String addres = "Jakarta";
        addres ="Surabaya";
        System.out.println(addres);
    }
}
//        int id = 10;
//        System.out.println("ID\t\t\t: "+id);
//        byte num = 127;
//        System.out.println("Number\t\t: "+num);
//// totalProductCart
//        float harga = 20000.50f;
//        System.out.println("Harga\t\t: "+harga);
//        double totalBill = 30000.50;
//        System.out.println("Total Bayar\t: "+totalBill);
//
//        //Char
//        char grade ='A';
//        System.out.println("Grade Nilai : " +grade);
//
//        //Path = C:\Juaracoding\sqabatch11\JavaFundamental
//        System.out.println("C:\\Juaracoding\\sqabatch11\\JavaFundamental");
//
//        //Boolean
//        boolean isActive = true;
//        boolean isStatus = false;
//
//        String namaProduk = "Mouse";
//        System.out.println("Nama Produk\t:" +namaProduk);


