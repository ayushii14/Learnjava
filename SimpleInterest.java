import java.util.Scanner;

public class SimpleInterest {
     public static void main(String args[]){

        double principal;
        double years,rate,simpleInterest,amount;
       Scanner sc =new Scanner (System.in);
        System.out.println("Enter Principal= ");
        principal=sc.nextDouble();

        System.out.println("Enter rate= ");
        rate=sc.nextDouble();

       System.out.println("Enter Time= ");
       years=sc.nextDouble();

       simpleInterest=(principal*rate*years)/100;
       amount=principal+simpleInterest;

       System.out.println("Principal= "+principal);
       System.out.println("rate= "+rate);
       System.out.println("time= "+years);
       System.out.println("Interest= "+simpleInterest);
       System.out.println("amount= "+amount);

    }
    
}
