/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg3.menampilkan.pkgabstract.pkgclass;

/**
 *
 * @author ASUS
 */
public class Percobaan3MenampilkanAbstractClass {

   public void breath(){
       System.out.println("Living Thing breathing...");}
   public void eat(){
       System.out.println("Living Thing eating...");
   }
   /**
    * abstract method walk
    * kita ingin method ini di-overridden oleh subclasses
    */
   public abstract void walk();
}
public class Human extends Percobaan3MenampilkanAbstractClass{
    public void walk(){
        System.out.println("Human walks...");
    }
}
