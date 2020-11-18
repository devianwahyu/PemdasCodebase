/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemdascodebase;

import java.util.Scanner;

/**
 *
 * @author Lenovo-PC
 */
public class InputOutput {

    public static void main(String[] args) {

        /* 
            Input
            Ada 2 class java yang dapat digunakan untuk input di java, yaitu:
            1. Scanner -> Digunakan selama praktikum
            2. BufferedReader
        
            Cara pemakaian Scanner:
            1. Import class Scanner -> import java.util.Scanner;
            2. Instansiasi objek -> Scanner sc = new Scanner(System.in);
            3. Pakai ke variabel -> sc.nextInt()
        
            Method yang sering dipakai dari class Scanner:
            1. nextInt() -> untuk input bilangan bulat
            2. nextLine() -> untuk input string
            3. nextDouble() -> untuk input double
            4. nextBoolean() -> untuk input boolean
            5. nextChar() -> untuk input char
            6. dll
        
            Output
            Ada 3 cara untuk melakukan output yang dibahas disini, yaitu:
            1. print
            2. println
            3. printf
        
            Cara pemakaian:
            1. print -> System.out.print()
                Digunakan untuk menampilkan output tanpa membuat baris baru
            2. println -> System.out.println()
                Digunakan untuk menampilkan output dengan menambahkan baris baru
            3. printf -> System.out.printf()
                Digunakan untuk menampilkan output dengan suatu format tertentu
                Format yang bisa dipakai di printf antara lain:
                - %s -> untuk string
                - %S -> untuk string uppercase
                - %d -> untuk bilangan bulat
                - %f -> untuk bilangan float/double
                - %c -> untuk char
                - %C -> untuk char uppercase
                - dll
        */
        
        // Latihan
        /*
        Buatlah program yang dapat menerima input dari pengguna berupa berat badan, tinggi, dan nama.
        Kemudian program anda dapat menghitung IMT dari inputan anda. 
        
        Remus mencari IMT/BMI = Berat badan/ Tinggi badan^2
        */
        
        // Instansiasi objek scanner
        Scanner in = new Scanner(System.in);
        
        // Deklarasi variabel
        double beratBadan, tinggiBadan, imt;
        String nama;
        
        // Input user
        System.out.printf("%-25s : ", "Masukkan berat badan (kg)");
        beratBadan = in.nextDouble();
        System.out.printf("%-25s : ", "Masukkan tinggi badan (m)");
        tinggiBadan = in.nextDouble();
        in.nextLine();
        System.out.printf("%-25s : ", "Masukkan nama anda");
        nama = in.nextLine();
        
        // Proses hitung imt
        imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        // Output
        System.out.printf("%s, berikut spesifikasi imt anda: \n", nama);
        System.out.printf("%-13s : %.2f\n", "Berat badan", beratBadan);
        System.out.printf("%-13s : %.2f\n", "Tinggi badan", tinggiBadan);
        System.out.printf("%-13s : %.2f\n", "IMT", imt);
        
    }

}
