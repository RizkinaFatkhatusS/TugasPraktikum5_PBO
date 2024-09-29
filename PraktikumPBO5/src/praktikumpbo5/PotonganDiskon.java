/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo5;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PotonganDiskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total pembelian (Rp.): ");
        double totalPembelian = input.nextDouble(); 
        double potongan;  
          if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;  
        } else {
            potongan = totalPembelian * 0.20;  
        }
        
        double totalBayar = totalPembelian - potongan;
        
        System.out.println("\n=== TAMPILAN OUTPUT ===");
        System.out.printf("Total pembelian Rp. = %.0f\n", totalPembelian);
        System.out.printf("Besarnya potongan Rp. = %.0f\n", potongan);
        System.out.printf("Jumlah yang harus dibayarkan Rp. = %.0f\n", totalBayar);
    }
}
