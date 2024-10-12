import java.util.Scanner;

public class SCLoop {
    
    public static void main(String args[]){
        //Display digits of a number

        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }

        // count digits of a number 
        System.out.println();
        int count=0;
        int m=23567;
        System.out.println("given number is: "+m);
        while(m>0){
            m=m/10;
            count++;
        }

        System.out.println("number of digits are: "+count);
       

        //finding a number is armstrong or not
        System.out.println();
        System.out.println("finding a number is armstrong or not");
        int a=153;
        System.out.println("given number is: "+a);
        int b=a;
        int sum=0;
        while(a>0){
            r=a%10;
            sum=sum+ r*r*r;
            a=a/10;
        }
        if(sum==b){
            System.out.println(b+" is an armstrong number");
        }
        else
       { System.out.println(b+" is not an armstrong number");}




       //reverse a number
       System.out.println("\nReverse");
       int rev=0;
      
       int p=456;
       System.out.print("The given number is: "+p);
       while(p>0){
        r=p%10;
        rev= rev*10+r;
        p=p/10;
       }
       System.out.println("\nthe reverse number is: "+rev);

// palindrome number checking
       int k=345;
       System.out.println("\nthe given number is: "+k);
       int re=0;
       int c=k;
       while(k>0){
        r=k%10;
        re=re*10+r;
        k=k/10;
       }
       System.out.println("reversed number is: "+re);
       if(c==re){
        System.out.println(c+" is a palindrome number");
       }
       else
       System.out.println(c+" is not a palindrome number");
    }
}
