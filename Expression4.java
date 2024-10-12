import java.util.Scanner;

public class Expression4 {
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        int length,breadth,height;
        int totalArea, Volume;

        System.out.println("Enter Length Breadth Height ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        totalArea= 2*((length*height)+(length*breadth)+(breadth*height));
        Volume= length*breadth*height ;

        System.out.println("Total Area is  "+totalArea);
        System.out.println("Volume is "+Volume);
    }
}
