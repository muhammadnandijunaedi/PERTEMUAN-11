/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package line.pkgimplements.relation;

/**
 *
 * @author ASUS
 */
public class LineImplementsRelation {

     private double x1;
   private double x2;
   private double y1;
   private double y2;
   
   public Line(double x1, double x2, double y1, double y2){
       this.x1 = x1;
       this.x2 = x2;
       this.y1 = y1;
       this.y2 = y2;
   }
   public double getLength(){
       double length = Math.sqrt((x2-x1)*(x2-x1) +
               (y2-y1)* (y2-y1));
       return length;
   }
   public boolean isGreater(object a, 0bject b){
       double aLen = ((Line)a).getLength();
       double bLen = ((Line)b).getLength();
       return (aLen > bLen);
   }
   public boolean isLess(object a,object b){
       double aLen = ((Line)a).getLength();
       double bLen = ((Line)b).getLength();
       return (aLen < bLen);
       
   }
   public boolean isEqual( object a, object b){
       double aLen = ((Line)a).getLength();
       double bLen = ((Line)b).getLength();
       return (aLen == bLen);
   }
}
public interface Relation {
    public boolean isGreater(object a, object b);
    public boolean isLess(object a, object b);
    public boolean isEqual(object a, object b);
}
