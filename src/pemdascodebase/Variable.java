/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemdascodebase;

/**
 *
 * @author Lenovo-PC
 */
public class Variable {
    
    public static void main(String[] args) {
        
        /*
        Variabel
        Variabel digunakan untuk menyimpan suatu nilai, baik yang diinputkan user maupun dari inisialisasi ketika membuat.
        Variabel menyimpan nilai yang sifatnya tidak tetap(bisa diubah).
        
        Cara pemakaian
        - data_type name;
        - data_type name = value;
        
        Konstanta
        Konstanta memiliki fungsi sama dengan variabel hanya saja dia menyimpan nilai yang tidak dapat diubah.
        
        Cara pemakaian:
        - final data_type name = value;

        Di Java dalam menuliskan nama variabel / identifier diusahakan memenuhi beberapa syarat:
        1. Nama variabel harus deskriptif, maksudnya nama variabel harus menggambarkan apa yg disimpan
            misal: 
            int panjang lebih jelas daripada int p

            10 -> panjang balok
            int pb = 10;
            int panjangBalok = 10;

        2. Menggunakan metode camelCase
            misal:
            int tinggiBadan bukan int tinggi_badan / TinggiBadan / dll
        */

        byte varByte = 127;

        long varLong = 127L;

        double varDouble = 1.2;

        float varFloat = 1.2F;

        char varChar = 'A';

        String varString = "asa";

        boolean varBool = true;

        final double PI = 3.14;

        varByte = 12;

    }
}
