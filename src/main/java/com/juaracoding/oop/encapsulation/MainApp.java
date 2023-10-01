package com.juaracoding.oop.encapsulation;

public class MainApp {
    public static void main(String[] args) {
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("password");

        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staf = new User();
        staf.setUsername("staf");
        staf.setPassword("123456");

        System.out.println(staf.getUsername());
        System.out.println(staf.getPassword());
    }


}
