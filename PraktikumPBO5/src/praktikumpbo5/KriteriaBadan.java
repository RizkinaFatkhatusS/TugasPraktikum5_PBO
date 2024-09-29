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
public class KriteriaBadan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.println("Nilai imt Anda: " + imt);
        int kategori;
          if (imt <= 18.4) {
            kategori = 1;
        } else if (imt <= 24.9) {
            kategori = 2;
        } else if (imt <= 29.9) {
            kategori = 3;
        } else if (imt <= 39.9) {
            kategori = 4;
        } else {
            kategori = 5;
        }
          switch (kategori) {
            case 1:
                System.out.println("Kategori: Berat Badan Kurang");
                break;
            case 2:
                System.out.println("Kategori: Berat Badan Ideal");
                break;
            case 3:
                System.out.println("Kategori: Berat Badan Lebih");
                break;
            case 4:
                System.out.println("Kategori: Gemuk");
                break;
            case 5:
                System.out.println("Kategori: Sangat Gemuk");
                break;
            default:
                System.out.println("Error dalam perhitungan kategori.");
                break;
        }
        input.close();
    }
}
