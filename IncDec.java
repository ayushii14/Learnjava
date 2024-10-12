import java.util.Scanner;

public class IncDec {

      public static void main(String arg[])
      {
        int x=5,y;
        y=x++; /* post increment */
        char b='A';
        b++;
        
        System.out.println(y);
        System.out.println(x);
        System.out.println(b);

        int f=2,h;

        h=2*f++ + 3*++f;
        System.out.println(h);

      }


    
}
