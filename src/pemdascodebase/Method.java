package pemdascodebase;

import java.util.Arrays;
import java.util.Scanner;

public class Method {

    // Static supaya dapat dipanggil di method static
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        Contoh Method yg ada di java
//        in.nextInt();
//        in.nextBoolean();

//        1. Keduanya dideklarasikan di class Scanner = diluar program utama
//        2. Dipakai di program utama/dipanggil = bagian program utama
//        3. Memiliki tugas yg spesifik = menangkap inputan user

//        Contoh Method void
//        1. dengan static
//        penjumlahan();

//        2. tanpa static
//        Method m = new Method();
//        m.perkalian();


//        Contoh Method Return Value
//        int hasilPembagian = pembagian();
//        System.out.println(hasilPembagian);

//        Contoh Method dengan Parameter
//        int hasilPengurangan = pengurangan(5, 2);
//        System.out.println(hasilPengurangan);

//        Contoh Method dengan Paramter Array
//        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
//        arr = sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Index  ke  " + (i + 1) + "  :  " + arr[i]);
//        }

//        Contoh Method Rekursif
//        int hasilFaktorial = faktorial(5);
//        System.out.println(hasilFaktorial);

//        Contoh Method Overload
//        int overload1 = a(2);
//        int overload2 = a(2.0);

//        Jawaban Soal Duniawi 1
//        int pilihanMenu = 0, n = 0, r = 0;
//
//        do {
//            System.out.print("Program Penghitung Kombinasi dan Permutasi\n" +
//                    "1. Menghitung Pertmutasi\n" +
//                    "2. Menghitung Kompinasi\n" +
//                    "3. Keluar\n" +
//                    "Masukkan pilihan Anda: ");
//            pilihanMenu = in.nextInt();
//
//            if (pilihanMenu == 1 || pilihanMenu == 2) {
//                System.out.print("Masukkan nilai n: ");
//                n = in.nextInt();
//                System.out.print("Masukkan nilai r: ");
//                r = in.nextInt();
//            }
//
//            switch (pilihanMenu) {
//                case 1:
//                    formatTampilan(hitungPermutasi(n, r), pilihanMenu);
//                    break;
//                case 2:
//                    formatTampilan(hitungKombinasi(n, r), pilihanMenu);
//                    break;
//                case 3:
//                    break;
//                default:
//                    System.out.println("Masukkan input sesuai menu.");
//            }
//        } while (pilihanMenu != 3);

//        Jawaban Soal Duniawi 2
//        int num;
//
//        System.out.print("Masukkan bilangan prima: ");
//        num = in.nextInt();
//        cekPrima(num);
//
//        int[] array = bilPrima();
//        System.out.println("\nrogram menentukan bilangan prima 1-100");
//        for (int value : array) {
//            if (value != 0) System.out.print(value + " ");
//            else System.out.print("");
//        }
//    }

    /*
    Pengertian Method:
    Method merupakan suatu program yang terletak terpisah
    dari program utama, tetapi tetap merupakan bagian dari
    program yang dibuat dan pembuatannya untuk tugas tertentu.

    Manfaat Dibuat Method:
        1. Program jadi mudah dipahami
        2. Mudah dalam dokumentasi

    Cara Penamaan Method:
    Cara penamaan method mirip dengan cara penamaan variabel :
        1. camelCase
        2. Deskriptif

    Lokasi Deklarasi:
    Didalam class. Bisa dalam satu class yg sama dengan program
    utama atau bisa di class lain.
    */

    /*
    Method Void
    Pengertian:
    Method void adalah method yang tidak mengembalikan nilai.

    Penulisan:
    modifier atribut? void methodName(parameter?){
       statement;
    }
    */

    // Contoh Method void
//    public static void penjumlahan() {
//        int bil1, bil2, hasil;
//
//        System.out.print("Masukkan nilai bil1 = ");
//        bil1 = in.nextInt();
//        System.out.print("Masukkan nilai bil2 = ");
//        bil2 = in.nextInt();
//
//        hasil = bil1 + bil2;
//
//        System.out.println(hasil);
//    }
//
//    void perkalian() {
//        int bil1, bil2, hasil;
//
//        System.out.print("Masukkan nilai bil1 = ");
//        bil1 = in.nextInt();
//        System.out.print("Masukkan nilai bil2 = ");
//        bil2 = in.nextInt();
//
//        hasil = bil1 * bil2;
//
//        System.out.println(hasil);
//    }

    /*
    Method Return Value
    Pengertian:
    Method return value adalah method yang mengembalikan nilai.

    Penulisan:
    modifier atribut? returnType methodName(parameter?){
        statement;
        return ...;
    }
    */

    // Contoh Method Return Value
//    public static int pembagian() {
//        int bil1, bil2;
//
//        bil1 = in.nextInt();
//        bil2 = in.nextInt();
//
//        return bil1/bil2;
//    }

    /*
    Method dengan Parameter
    Method yg ketika dipanggil perlu memberikan nilai untuk parameter.
    */

    // Contoh Method dengan Parameter
//    public static int pengurangan(int a, int b) {
//        return a-b;
//    }

    /*
    Method Return Value dengan Array Parameter
    Sama dengan method return value biasa bedanya hanya pada
    return value dan parameternya berupa array.
    */

    // Contoh Method Return Value dengan Array Parameter
//    private static int[] sort(int[] acak) {
//        int bil1 = 0;
//        int bil2 = 0;
//        while (bil1 < acak.length) {
//            bil2 = bil1;
//            while (bil2 < acak.length) {
//                if (acak[bil1] < acak[bil2]) {
//                    int temp = acak[bil1];
//                    acak[bil1] = acak[bil2];
//                    acak[bil2] = temp;
//                }
//                bil2++;
//            }
//            bil1++;
//        }
//        return acak;
//    }

    /*
    Method Rekursif
    Pengertian:
    Method rekursif merupakan suatu method/statement yang
    berfungsi untuk memanggil dirinya sendiri.
    */

    // Contoh Method Rekursif
//    private static int faktorial(int bil) { // bil = 5 -> 4 -> 3 -> 2 -> 1
//        if (bil == 1) return 1;
//        else return(bil * faktorial(bil - 1));
//        // 5 * 4 * 3 * 2 * 1 = 120
//    }

    /*
    Method Overload
    Pengertian:
    Konsep dimana ada 2 atau lebih method dengan nama sama
    dalam satu kelas, namun parameternya beda.
    */

    // Contoh Method Overload
//    int a(int b){return 0;}
//    double a(double b){return 0;}

    /*
    Soal Duniawi 1
    Buatlah program dengan method untuk menghitung nilai permutasi dan kombinasi
    dari sebuah nilai yang dimasukkan
     */

    // Jawaban
//    private static int hitungPermutasi(int n, int r) {
//        int hasil;
//        hasil = faktorial(n) / faktorial(n-r);
//        return hasil;
//    }
//
//    private static int hitungKombinasi(int n, int r) {
//        int hasil;
//        hasil = faktorial(n) / (faktorial(n-r) * faktorial(r));
//        return hasil;
//    }
//
//    private static int faktorial(int x) {
//        if (x == 1) return 1;
//        else return(x * faktorial(x - 1));
//    }
//
//    private static void formatTampilan(int hasil, int pilihanMenu) {
//        if (pilihanMenu == 1) {
//            System.out.printf("%-8s%-6s\n", "", "n!");
//            System.out.printf("%-5s = %6s = %d\n", "nPr", "------", hasil);
//            System.out.printf("%-8s%-6s\n", "", "(n-r)!");
//        } else {
//            System.out.printf("%-8s%-12s\n", "", "n!");
//            System.out.printf("%-5s = %12s = %d\n", "nCr", "------------", hasil);
//            System.out.printf("%-8s%-12s\n", "", "(n-r)! x r!");
//        }
//    }

    /*
    Soal Duniawi 2
    Program untuk menentukan apakah bilangan tersebut bilangan prima atau bukan
    dengan menginputkan sebuah bilangan yang di inginkan. Setelah itu program
    akan mengoutputkan bilangan prima 1-100
     */

    // Jawaban
//    private static void cekPrima(int num) {
//        int temp;
//        String type = "";
//        if (num < 2) type = "bukan";
//        for (int i = 2; i <= num / 2; i++) {
//            temp = num % i;
//            if (temp == 0) {
//                type = "bukan";
//                break;
//            }
//        }
//        System.out.printf("Bilangan %d termasuk %s bilangan prima", num, type);
//    }
//
//    private static int[] bilPrima() {
//        int[] arr = new int[100];
//        int bil, counter = 0;
//
//        for (int i = 2; i <= 100; i++) {
//            bil = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    bil = bil + 1;
//                }
//            }
//            if (bil == 2) {
//                arr[counter] = i;
//                counter++;
//            }
//        }
//        return arr;
//    }

}
