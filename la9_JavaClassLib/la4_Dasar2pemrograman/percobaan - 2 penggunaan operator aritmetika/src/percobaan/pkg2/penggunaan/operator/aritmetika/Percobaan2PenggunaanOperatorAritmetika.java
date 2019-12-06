/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg2.penggunaan.operator.aritmetika;

/**
 *
 * @author PC 013
 */
public class Percobaan2PenggunaanOperatorAritmetika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sedikit angka
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        System.out.println("Variabel values...");
        System.out.println("   i = " + i);
        System.out.println("   j = " + j);
        System.out.println("   x = " + x);
        System.out.println("   y = " + y);
        
        //penjumlahan angka
        System.out.println("Adding...");
        System.out.println("   i + j = " + (i + j));
        System.out.println("   x + y = " + (x + y));
        
        //Pengurangan angka
        System.out.println("Substracking...");
        System.out.println("   i - j = " + (i - j));
        System.out.println("   x - y = " + (x - y));
        
        //perkalian angka
        System.out.println("Multiplying...");
        System.out.println("   i * j = " + (i * j));
        System.out.println("   x * y = " + (x * y));
        
        //pembagian angka
        System.out.println("Dividing...");
        System.out.println("   i / j = " + (i / j));
        System.out.println("   x / y = " + (x / y));
        
        //Menghitung hasil modulus dari pembagian
        System.out.println("Computing the remainder...");
        System.out.println("   i % j = " + (i % j));
        System.out.println("   x % y = " + (x % y));
        
        //tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println("   j + y = " + (j + y));
        System.out.println("   i * x = " + (i * x));
    }
    
}
