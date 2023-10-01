package com.juaracoding;

import java.util.Date;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("JuaraCoding");

        String name = "Juara Coding";
        if (true){
            System.out.println("IF Statement");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            System.out.println("Juara Coding");
        }

        //method Sting
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //substring
        System.out.println(name.substring(0,5));

        String path = "juara coding";
        System.out.println(path.replace(" ", "_"));

        //Ujian minggu ke 1- nomor 3
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDay());
        int dow = date.getDay()+5;

        //get String Day
        // creating a constructor of the Format class
        //displaying full-day name
//        format f = new SimmpleDateFormat ("EEE");
//        String strDay = f.format(new Date());
//        //prints day name
//        System.out.println("Day Name : "+strDay);
        if(dow >= 1 && dow <=5 ){
            System.out.println("Harga tiket bioskop Rp. 30.000");
        }else{
            System.out.println("Harga tiket bioskop Rp. 40.000");
        }

        for (int i = 1; i <= 7; i++) {
            if (i <= 5 ){
                continue;
            }
            System.out.println("weekend = " +i);
            System.out.println(i);
        }

    }
}