import java.util.*;

class Readkeyboard2
{
                  public static void main(String args[])
                  {
                      try (Scanner sc = new Scanner(System.in)) {
                        int x,y;
           System.out.println("Enter two numbers");
                        x=sc.nextInt();
                        y=sc.nextInt();
           int  z=x+y;
                        System.out.println("sum is" +z);
                      }
                     }
}