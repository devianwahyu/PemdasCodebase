/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemdascodebase;

import java.util.Scanner;

/**
 *
 * @author devianwahyu
 */
public class Looping {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Perulangan
           
           1. for
           Penulisan: 
           for (batas_awal; batas_akhir; kenaikan) {statement}
        
           2. while
           Penulisan:
           while(condition) {statement}
        
           3. do while
           Penulisan:
           do{
             statement
           }
           while(condition);
        
           Tambahan: 
                continue -> meloncati statement dan lanjut looping
                break -> keluar looping
        
         */
        // Latihan for
        // Tampilkan bilangan 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        // Tampilkan bilangan 10 sampai 1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        // Tampilkan bilangan loncat 2 dari 0 sampai 20
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        // Latihan while dan do while
        // Lakukan perulangan dengan kondisi berupa string
        // while solution
        String yesOrNo = "yes";

        while (yesOrNo.equals("yes")) {
            System.out.println("yes dari while");
            yesOrNo = "no";
        }

        // do while solution
        do {
            System.out.println("yes dari do while");
        } while (yesOrNo.equals("no"));

        // Latihan continue dan break
        // Lakukan looping dari 1 sampai 10
        // jangan tampilkan angka 3 dan berhenti loop sampai angka 6
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            } else if (i == 6) {
                break;
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");

        /* ~~ Tugas Praktikum ~~
        
        1 Buatlah program dengan tampilan sebagai berikut :
          Masukkan nilai n = 4
          |      *|
          |    * *|
          |  * * *|
          |* * * *|
          step 1: Bayangkan persegi
          step 2: Membuat segitiga tidak terlihat
          step 3: Membuat segitiga biasa dengan simbol *

        2 Buatlah looping yang menuliskan nama anda secara vertikal, dengan huruf yang sesuai dengan
          huruf yang di tulisan
          Contoh menuliskan A :
                A
              A   A
             A     A
            A A A A A
           A         A
          A           A
        
        3 Buatlah program sederhana untuk menghitung beberapa volume bidang dengan tampilan awal
          sebagai berikut :
          MENU
          0. KELUAR
          1. HITUNG VOLUME BALOK
          2. HITUNG VOLUME BOLA
          3. HITUNG VOLUME KERUCUT
          4. HITUNG VOLUME SILINDER
          5. HITUNG VOLUME LIMAS SEGITIGA
          MASUKKAN PILIHAN ANDA : 
        
         */
//        Soal 1
        int n;

        System.out.print("Masukkan nilai n = ");
        n = in.nextInt();

        // Looping untuk membuat baris
        for (int i = 0; i < n; i++) {
            // Looping untuk membuat kolom
            for (int j = 0; j < n; j++) {
                System.out.print("k" + j + " ");
            }
            System.out.println("b" + i);
        }

        System.out.println("====================");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("? ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(". ");
            }
            System.out.println("");
        }

//        Soal 2
//        Huruf B
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 2 || i == 4) && j != 4
                        || j == 0 || ((i == 1 || i == 3) && j == 4)) {
                    System.out.print("B ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

//        Huruf K
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0
                        || ((i == 0 || i == 4) && j == 3)
                        || ((i == 1 || i == 3) && j == 2)
                        || i == 2 && j == 1) {
                    System.out.print("K ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

//        Huruf V
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 && (j == 0 || j == 4))
                        || (i == 1 && (j == 1 || j == 3))
                        || (i == 2 && j == 2)) {
                    System.out.print("v ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

//        Soal 3
        int pilihanUser, p, l, t, volume;

        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihanUser = in.nextInt();

            switch (pilihanUser) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    p = in.nextInt();
                    System.out.print("Masukkan lebar: ");
                    l = in.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    t = in.nextInt();

                    volume = p * l * t;

                    System.out.println("LUAS BALOK = " + volume);
            }
        } while (pilihanUser != 0);

    }

}
