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
       System.out.println("Inside Person:Constructor");
       name = "";
       address = "";
   }
   /**
    * Constructor dengan dua parameter
    */
   public Person( String name, String address){
       this.name = name;
       this.address = address;
   }
   /**
    * Method accessor
    */
   public String getName(){
       System.out.println("Person Name : " +name);
       return name;
   }
   public String getAddress(){
       return address;
   }
   public void setAddress(String add){
       this.address = add;
   }
}
public class Student extends Person{
    public Student()
    {
        //super( "SomeName, "SomeAddress");
        //super();
        //super.name = "name";
        System.out.println("Inside Student:Constructor");
    }
    public String getName(){
        System.out.println("Student Name : " +name);
        return name;
    
    }
    public static void main( String[] args){
        Student anna = new Student();
    }
            
            
}
public class Employee extends Person{
    public String getName(){
        System.out.println("Employee Name:" +name);
        return name;
    }
    public static void main(String[] args)
    {
        Person ref;
        Student student0bject = new Student();
        Employee employee0bject = new Employee();
        
        ref = student0bject; //Person menunjuk kepada object Student
        
        String temp = ref.getName(); //getName dari Student class dipanggil
        System.out.println(temp);
        
        ref = employee0bject; //Person menunjuk kepada object Employee
        
        temp = ref.getName(); //getName dari Employee class dipanggil
        System.out.println(temp);
    }
}
