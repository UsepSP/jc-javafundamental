package com.juaracoding.oop.polymorphism;

public class Kotak extends BangunDatar{

    //method Overriding
    void draw(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
