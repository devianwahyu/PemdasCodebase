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
public class SeleksiKondisi {

    public static void main(String[] args) {

        /*
        
        Percabangan
        Di Java percabangan dapat diatasi dengan beberapa alternatif:
        1. if
        2. switch case
        3. ternary operator
        
        Cara pemakaian:
        1. if
            if(condition) {
                statement;
            } else if (condition) {
                statement;
            } else {
                statement;
            }
        2. switch case
            switch(conditional_variabel) {
                case 1:
                    statement;
                    break;
                case n:
                    statement;
                    break;
                default:
                    statement;
            }
        3. ternary operation
            data_type variable_name = (condition) ? true_statement : false_statement;
        
        Nested condition
        Keadaan dimana ada percabangan di dalam percabangan, misal:
        if(condition) {
            if(condition) {
                statement;
            }
        }
        
         */

        /*
        
        Kasus 1
        Budi naik kelas jika nilainya lebih dari 70

        Kasus 2
        Budi dapat nilai A jika ujiannya diatas 80, nilai B jika ujiannya diatas 70, dan nilai C jika diatas 60. 
        Jika dibawah 60 maka nilainya D.

        Kasus 3
        Berat badan Budi ideal jika lebih dari 60kg dan dibawah 65kg.

        Kasus 4
        Budi disuruh konversi angka jadi hari, misal 1 = minggu, 2 = senin, dst
        
        */
        
        Scanner in = new Scanner(System.in);
        
        // Kasus 1
//        double nilai = in.nextDouble();
                
        // Ternary solution
//        String naikKelas = (nilai >= 70) ? "Naik kelas" : "Tinggal kelas";
//        
//        System.out.println(naikKelas);
        
        // if solution
//        if(nilai >= 70) {
//            System.out.println("Naik Kelas");
//        } else {
//            System.out.println("Tinggal kelas");
//        }

        // Kasus 2
        // if solution
//        String nilaiHuruf;
//        
//        if (nilai >= 80) {
//            nilaiHuruf = "A";
//        } else if (nilai >= 70) {
//            nilaiHuruf = "B";
//        } else if (nilai >= 60) {
//            nilaiHuruf = "C";
//        } else {
//            nilaiHuruf = "D";
//        }
//        System.out.println(nilaiHuruf);

        // Kasus 3
//        double beratBadan = in.nextDouble();
        // Nested if
//        if (beratBadan > 60) {
//            if (beratBadan < 65) {
//                System.out.println("Ideal");
//            } else {
//                System.out.println("Kegemukan");
//            }
//        } else {
//            System.out.println("Kekurusan");
//        }

        // if dengan bantuan && operation
//        if (beratBadan > 60 && beratBadan < 65) {
//            System.out.println("Ideal");
//        } else {
//            System.out.println("Tidak ideal");
//        }

        // Kasus 4
        // Switch Case solution
//        String hariBukanAngka;
//        int hariDalamAngka = in.nextInt();
//        
//        switch(hariDalamAngka) {
//            case 1:
//                hariBukanAngka = "Minggu";
//                break;
//            case 2:
//                hariBukanAngka = "Senin";
//                break;
//            case 3:
//                hariBukanAngka = "Selasa";
//                break;
//            case 4:
//                hariBukanAngka = "Rabu";
//                break;
//            case 5:
//                hariBukanAngka = "Kamis";
//                break;
//            case 6:
//                hariBukanAngka = "Jum'at";
//                break;
//            case 7:
//                hariBukanAngka = "Sabtu";
//                break;
//            default:
//                hariBukanAngka = "Hari tidak ditemukan";
//        }
//        
//        System.out.println(hariBukanAngka);
        
        
    }

}
