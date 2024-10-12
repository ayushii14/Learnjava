import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");


        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter Option in words");
        sc.nextLine(); //after enter for second number it will stay in the keyboardbuffer so write again
      String  option=sc.nextLine();
      option=option.toUpperCase();
       switch (option){
            case "ADD": System.out.println("sum is "+ (x+y));
            break;
            case "SUB": System.out.println("Subtraction is "+(x-y));
            break;
            case "MUL": System.out.println("Multiplication is "+(x*y));
break;
case "DIV" : System.out.println("Division is "+(x/y));
break;
default: System.out.println("Invalid Option");
break;
    }


        // challenge enter the number and give the name of the month
System.out.println("Enter a number ");
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("january");
                break;
        case 2: System.out.println("february");
        break;
        case 3: System.out.println("march");
        break;
        default: System.out.println("invalid month");
                break;
        }
    
}
}
