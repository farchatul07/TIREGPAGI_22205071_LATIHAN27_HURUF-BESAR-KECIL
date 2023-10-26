/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan27;
import java.util.Scanner;

/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program untuk merubah huruf besar dan huruf kecil
 */
public class Latihan27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while (ulangi) {
            System.out.println("Masukan Kalimat : ");
            String kalimat = input.next();
            
            String kalimatKecil = kalimat.toLowerCase();
            String kalimatBesar = kalimat.toUpperCase();
            
            System.out.println("===== Hasil formatting =====");
            System.out.println("HurufBesar = " +kalimatBesar);
            System.out.println("HurufKecil = " +kalimatKecil);
            
            System.out.println("\nUlangi Program? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya"){
                System.out.println("Program akan diulangi");
            }else if(ulang == "tidak"){
                System.out.println("Program berhenti terimakasih");
                ulangi = false;
            }
        }
    }
}
