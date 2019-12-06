/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg8.penggunaan.operator.kondisi.contoh.pkg1;

/**
 *
 * @author ASUS
 */
public class Percobaan8PenggunaanOperatorKondisiContoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String    status = "";
        int grade = 80;
        
        //mendapatkan status pelajar
        status = (grade >= 60)?"passed":"fail";
        
        //print status
        System.out.println( status );
    }
}
