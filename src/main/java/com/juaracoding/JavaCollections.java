package com.juaracoding;

import java.util.ArrayList;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //Menambahkan Item = add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //mengakses item = get
        System.out.println(cars.get(1));

        //Mengubah Item = set
        cars.set(0, "Toyota");
        System.out.println(cars);

        //Menghapus Item = remove
        cars.remove(3);
        System.out.println(cars);

        //Jumlah item pada collections = size
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String data : cars) {
            System.out.println(data);
        }

        //Menu CRUD
        //1. Menampilkan data
        //2. Menambah data
        //3. Perbaharui data
        //4. Hapus data
        //5. Keluar dari Program
    }
}
