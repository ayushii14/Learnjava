
package Classes;
//here there are 2 class so java will create 2 separate class files for them.
class Circle{
    double radius;
    double area(){
      return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
      }
      double circumference(){
        return perimeter();
      }
}
public class Objects {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=7;
        Circle c2=new Circle();
        c2.radius=6;
        System.out.println("area,perimeter and circumference of circle 1: ");
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
System.out.println();
System.out.println("area,perimeter and circumference of circle 2: ");
      System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());



    }
}
