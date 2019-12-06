/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg5.pkgcontinue.statement;

/**
 *
 * @author ASUS
 */
public class Percobaan5ContinueStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
       int count = 0;
       
       for( int i=0; i<names.length; i++){
           
           if( !names[i].equals("Beah") ){
               continue;    //skip next statement
           }
           
           count++;
       }
       
       System.out.println("There are" + count + " Beahs in the list");
    }
}
