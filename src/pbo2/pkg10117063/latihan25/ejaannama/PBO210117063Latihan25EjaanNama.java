/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan25EjaanNama {

    /*
    Nama : Cessario Sheva Lakita Purwa Adidjaya 
    Nim : 10117063
    Kelas : IF-2
    Deskripsi Program : Menampilkan Ejaan Nama
     
     */
    public static void main(String[] args) {
        String kalimat;
        int i = 0;
        int j = 1;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan Anda Untuk Dieja : ");
        kalimat = scanner.next();
        
        String[] panjangNama = kalimat.split("");
        
        System.out.println("");
        System.out.println("Ejaan Untuk " +kalimat+ " Adalah");
        
        while (i < panjangNama.length){
        System.out.println("Huruf ke-" +i+ " : " +panjangNama[i]);
        j= j+1;
        i++;
    }
    }
    
}
