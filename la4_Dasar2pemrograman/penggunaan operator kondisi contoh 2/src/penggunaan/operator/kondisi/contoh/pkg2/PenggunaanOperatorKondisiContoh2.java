/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penggunaan.operator.kondisi.contoh.pkg2;

/**
 *
 * @author ASUS
 */
public class PenggunaanOperatorKondisiContoh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int   score = 0;
        char answer = 'a';
        
        score = (answer == 'a') ? 10 : 0;
        System.out.println("score = " + score);
    }
}
