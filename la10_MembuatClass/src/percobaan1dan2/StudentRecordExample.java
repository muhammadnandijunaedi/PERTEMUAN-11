/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10;

/**
 *
 * @author ASUS
 */
public class StudentRecordExample {
     public static void main( String[] args ){   
 //membuat 3 object StudentRecord   
 Modul10 annaRecord = new Modul10();    
 Modul10 beahRecord = new Modul10();    
 Modul10 crisRecord = new Modul10();    
 //Memberi nama siswa   
 annaRecord.setName("Anna");   
 beahRecord.setName("Beah");   
 crisRecord.setName("Cris");   
 //Menampilkan nama siswa “Anna”   
 System.out.println( annaRecord.getName() );   
 //Menampilkan jumlah siswa   
 System.out.println("Count="+Modul10.getStudentCount()  
 );   
 }   
 
    
}
