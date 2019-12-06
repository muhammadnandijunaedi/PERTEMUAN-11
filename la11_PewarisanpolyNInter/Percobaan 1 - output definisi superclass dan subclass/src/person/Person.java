/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author ASUS
 */
public class Person {

   protected String name;
    protected String address;
    /**
     * Default constructor
     */
    public Person(){
        System.out.println("Inside Person: Constuctor");
        name = "";
        address = "";
    }
    /**
     * Constructur dengan dua parameter
     */
    public Person( String name, String address){
        this.name = name;
        this.address = address;
    }
    /**
     * Method accessor
     */
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String add){
        this.address = add;
    }
}
public class Student extends Person {
public Student()
{
    //super( "SomeName", "SomeAddress");
    //super.name = "name";
    System.out.println("Inside Student:Constructor");
}
public static void main( String[] args){
    Student anna = new Student();
}
}
    

