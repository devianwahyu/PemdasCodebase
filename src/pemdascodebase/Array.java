package pemdascodebase;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        /*
         Array

        - Array adalah tipe data reference yang dapat menyimpan beberapa data dengan tipe yang sama (di java).
        - Array terdiri dari index-index dan dimulai dengan index 0
        - Sintaks penulisan:
            data_type[] var_name = new data_type[n];
            data_type var_name[] = new data_type[n];

        Misalkan contoh ada array dengan nama a dengan jumlah elemen sebanyak 7 menyimpan data dengan tipe int
        - int[] a = new int[7];

        [a0][a1][a2][a3][a4][a5][a6]

        Inisialisasi nilai pada array:
        -   int[] a = {1, 2, 3, 4, 5, 6, 7};

        -   int[] a = new int[7];
            a[0] = 0;
            a[1] = 0;
            a[2] = 0;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
            a[6] = 7;

        -   a0=[1], a1=[2], a2=[3], a3=[4], a4=[5], a5=[6], a6=[7]

        Array 1 dimensi: array yang memiliki 1 set kurung siku
        contoh: int[] a = new int[n]

        Array 2 dimensi: array yang memiliki 2 set kurung siku, bisa dibilang memiliki index baris dan kolom
        contoh: int[][] a = new int[n][n];
        cara assign value:
            int[][] a = {{1, 2}, {3, 4}};
            a[0][0] = 1;
            a[0][1] = 2;
            a[1][0] = 3;
            a[1][1] = 4;

        Array n dimensi: array yang memiliki n set kurung siku

         */

        // Materi
//        int[] a = {1, 2, 3, 4, 5};
//
//        System.out.println(a.length);
//
//        System.out.println(a[3]);

//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        System.out.println();

//        for (int value:a) {
//            System.out.print(value + ", ");
//        }
//        System.out.println();

//        int[][] arr2D = {{1, 2}, {2, 3}};

//        System.out.println(arr2D[0][0]);

//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D.length; j++) {
//                System.out.print(arr2D[i][j] + " ");
//            }
//            System.out.println();
//        }

        /*
        Soal 1

        Buatlah program dengan pilihan menu yang terus berulang, dan menu akan berhenti jika user
        akan menginputkan angka “ 7 ”. Pilihan menunya adalah :
        1. Input Data
        2. Lihat Data
        3. Average
        4. Sum
        5. Max
        6. Min
        7. Keluar
        Masukkan nilai :

        */

//        Scanner in = new Scanner(System.in);
//
//        int[] arr = new int[1];
//        int inputAngkaUser, pilihanMenuUser;
//        double average;
//        int indexArr = 0, indexArrCopy = arr.length;
//
//        do {
//            System.out.println("1. Input Data");
//            System.out.println("2. Lihat Data");
//            System.out.println("3. Average");
//            System.out.print("Masukkan nilai: ");
//            pilihanMenuUser = in.nextInt();
//
//            switch(pilihanMenuUser) {
//                case 1:
//                    System.out.print("Masukkan angka: ");
//                    inputAngkaUser = in.nextInt();
//                    arr[indexArr] = inputAngkaUser;
//
//                    indexArrCopy++;
//                    int[] arrCopy = Arrays.copyOf(arr, indexArrCopy);
//                    arr = Arrays.copyOf(arrCopy, arrCopy.length);
//
//                    indexArr++;
//                    break;
//                case 2:
//                    for (int i = 0; i < arr.length-1; i++) {
//                        System.out.printf("[%d], ", arr[i]);
//                    }
//                    System.out.println("");
//                    break;
//                case 3:
//                    double sum = 0; // 1 + 2 = 3 + 3 = 6.0
//                    // int[] arr -> 1, 2, 3
//                    for (int value: arr) {
//                        sum += (double)value;
//                    }
//                    average = sum / (arr.length-1);
//                    System.out.println("Average = " + average);
//            }
//        } while (pilihanMenuUser != 7);


        /*
        Buatlah program dengan pilihan menu yang terus berulang, dan menu akan berhenti jika user
        akan menginputkan angka selain yang diminta. Program ini memiliki array 2D untuk
        menyimpan data Kereta Api.
        |    Jenis    |  Harga  |  Diskon  |     AC     |     Colokan     |
        |  Ekonomi    |  50000  |    2 %   |  Tidak Ada |    Tidak Ada    |
        |  BIsnis     |  100000 |    5 %   |  Ada       |    Tidak Ada    |
        |  Eksekutif  |  200000 |    7 %   |  Ada       |    Tidak Ada    |
        |  Pariwisata |  300000 |    10 %  |  Ada       |    Ada          |
        Pilihan menunya adalah :
        1. Melihat Daftar Kereta Api
        2. Melihat Daftar Kereta Api yang ada AC
        3. Melihat Daftar Kereta Api yang ada Colokan
        4. Memesan Tiket Kereta Api
        5. Melihat Pesanan Tiket
        Masukkan nilai :
        */

        Scanner in = new Scanner(System.in);

        String[][] listKereta = {
            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10", "Ada", "Ada"},
        };
        int pilihanMenuUser;

        String[] pesanTiket = new String[2];

        do {
            System.out.print("Pilihan menunya adalah :\n" +
                "1. Melihat Daftar Kereta Api\n" +
                "2. Melihat Daftar Kereta Api yang ada AC\n" +
                "3. Melihat Daftar Kereta Api yang ada Colokan\n" +
                "4. Memesan Tiket Kereta Api\n" +
                "5. Melihat Pesanan Tiket\n" +
                "Masukkan nilai: ");
            pilihanMenuUser = in.nextInt();
            in.nextLine();

            switch(pilihanMenuUser) {
                case 1:
                    System.out.println("List Kereta: ");
                    for (int i = 0; i < listKereta.length; i++) {
                        System.out.println(listKereta[i][0]);
                    }
                    break;
                case 2:
                    System.out.println("List Kereta dengan AC: ");
                    for (int i = 0; i < listKereta.length; i++) {
                        if (listKereta[i][3].equalsIgnoreCase("Ada")) {
                            System.out.println(listKereta[i][0]);
                        } else {
                            System.out.print("");
                        }
                    }
                    break;
                case 3:
                    System.out.println("List Kereta dengan colokan: ");
                    for (int i = 0; i < listKereta.length; i++) {
                        if (listKereta[i][4].equalsIgnoreCase("Ada")) {
                            System.out.println(listKereta[i][0]);
                        } else {
                            System.out.print("");
                        }
                    }
                    break;
                case 4:
                    String namaUser, jenisKereta = "";
                    int pilihKereta;
                    System.out.print("Masukkan nama anda: ");
                    namaUser = in.nextLine();
                    System.out.print("Pilih jenis kereta: ");
                    pilihKereta = in.nextInt();

                    // Assign nilai ke pesanTiket
                    pesanTiket[0] = namaUser;
                    switch(pilihKereta) {
                        case 1:
                            jenisKereta = "Ekonomi";
                            break;
                        case 2:
                            jenisKereta = "Bisnis";
                            break;
                        case 3:
                            jenisKereta = "Eksekutif";
                            break;
                        case 4:
                            jenisKereta = "Pariwisata";
                            break;
                    }
                    pesanTiket[1] = jenisKereta;
                    System.out.println("Nama Penumpang: " + pesanTiket[0]);
                    System.out.println("Jenis Kereta: " + pesanTiket[1]);
            }
        } while (pilihanMenuUser>0 && pilihanMenuUser<6);

    }

}

