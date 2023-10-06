/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Array {
    public static void main (String[] args) {
   
        // membuat array buah-buahan
        String[] sayur = new String[5];
        
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // mengisi data ke array
        for (int i = 0; i < sayur.length; i++) {
            System.out.print("sayur ke-" + i + ": ");
            sayur[i] = scan.nextLine();
        }
        
        System.out.println("---------------------------");
        
        // menampilkan semua isi array
        for (String b : sayur) {
            System.out.println(b);
        }
    }
}
