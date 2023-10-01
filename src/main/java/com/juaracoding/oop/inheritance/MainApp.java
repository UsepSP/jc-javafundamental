package com.juaracoding.oop.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Karyawan karyawan= new Karyawan();
        karyawan.name = "admin";

        Manager manager = new Manager();
        manager.name = "Manager";
        System.out.println(manager.name);
    }
}
