/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg5.penggunaan.operator.logika.dan.pkgboolean.or;

/**
 *
 * @author ASUS
 */
public class Percobaan5PenggunaanOperatorLogikaDanBooleanOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  i   = 0;
        int  j   = 10;
        boolean test = false;
        
        //demonstrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
