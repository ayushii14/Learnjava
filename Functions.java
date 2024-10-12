import java.util.Scanner;

 //public class Functions{
  /***   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("multiplication is equals to: "+multi(a, b));
          
        
        System.out.println("enter the number n:");
        int n=sc.nextInt();
        System.out.println("Factorial of the number "+n+" is :"+(factorial(n)));
            }

    public static int multi(int a,int b){
        int multi= a*b;
        return multi;
}

//Factorial of a number
public static int factorial(int n){

    if(n<=0){
        System.out.println("Invaild number");
        return -1;
    } 

    int factorial=1;
    for (int i = 1; i <=n ; i++) {
       factorial= factorial*i;
     } 
        System.out.println(factorial); 
    return factorial; 
    
    }
} ***/

// practice questions

//q1)Enter 3 numbers from the user & make a function to print their average.
//q2)Write a function to print the sum of all odd numbers from 1 to n.
//q3)Write a function which takes in 2 numbers and returns the greater of those two.

public class Functions{
public static void main(String[] args){

   
    System.out.println("Enter 3 numbers: ");
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   
    System.out.println("Avg is equals to: "+avg(a, b, c));

    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    System.out.println("Sum of odd numbers till n is: " +oddSum(n));
    

    System.out.println("Enter 2 numbers: ");
    int p=sc.nextInt();
    int q=sc.nextInt();

   graternum(p, q);


}
public static float avg(int a,int b,int c){

    int avg= (a+b+c)/3;
    return avg;
}


//2
public static int oddSum(int n){
    int sum=0;
    for(int i=1; i<=n;i++){
        if(i%2!=0){
            System.out.println(i);
        sum=sum+i;
        }
        else{
            continue;
        }
      }
       return sum;
}


//3
public static void graternum(int p,int q){
    if(p>q){
        System.out.println("greater number is: "+p);
    }
    else
    System.out.println("greater number is: "+q);
    
}
 }
