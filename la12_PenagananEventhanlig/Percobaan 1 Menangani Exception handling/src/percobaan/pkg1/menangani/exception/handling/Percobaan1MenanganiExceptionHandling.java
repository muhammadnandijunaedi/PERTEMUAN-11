/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg1.menangani.exception.handling;

/**
 *
 * @author ASUS
 */
public class Percobaan1MenanganiExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println( args[1]);           
        }catch( ArrayIndexOutOfBoundsException exp ){
            System.out.println("Exception caught!");
        }
    }
}
