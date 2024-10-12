import java.util.Scanner;

public class SCLoop2 {
    public static void main(String[] args) {

        // display a number in words even with tailing 0
        int n = 45600;
        System.out.println("the given number is: " + n);
        int r;
        String rev = "";
        while (n > 0) {
            r = n % 10;
            rev = rev + r;
            n = n / 10;
        }

        System.out.println("reversed number is: " + rev);
        char c;
        for (int i = rev.length() - 1; i >= 0; i--) {
            c = rev.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        }

        // Geomatric Progression series 2,6,18,.....
        System.out.println("");
        System.out.println("Make a Geomatric Progression series");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number, common difference and total number of digits you want:-");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int turns = sc.nextInt();
        int term = a;
        System.out.println("gp series:-");
        for (int i = 1; i <= turns; i++) {
            System.out.print(term + " ");
            term = term * d;
        }



        //fibonacci series
        System.out.println();
        System.out.println("fibonacci series");

        int m=0,x=1;
        System.out.print(m+" ,"+x+",");
        int o;
        for(int i=1;i<=8;i++){
           o=m+x;
            System.out.print(o+" ,");
            m=x;
            x=o;
        }
    }
}
