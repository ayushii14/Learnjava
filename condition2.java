import java.util.Scanner;
public class condition2 {
    public static void main(String[] args) {

     /*** challenge 1
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        if (n % 2 == 0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number");
        }

        //challenge 2
        int age;
        System.out.println("\nEnter Your Age");
        age = sc.nextInt();
        if (age <18) {
            System.out.println("You are Young");
    }
    else{
        System.out.println("You are Old");
    }

    // challenge 3

    int m1,m2,m3;
    System.out.println("\nEnter three marks : ");
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();
    float avg= (float) (m1+m2+m3)/3;
    if(avg>=80){
        System.out.println("Grade is A+");
    }
    else if(70<=avg && avg<80){
        System.out.println("Grade is A");
    }
    else if(60<=avg &&avg<70){  //cannot write it as 60<=avg<70
        System.out.println("Grade is B");
    }
else{
    System.out.println("Grade is C");
} ***/

// class 62 challenge 1
Scanner scan=new Scanner(System.in);
String num;
System.out.println("Enter a Number");
num = scan.nextLine();

if(num.matches("[01]+")){
    System.out.println("Binary Radix=2");
}
else if(num.matches("[0-7]+"))
{
    System.out.println("Octal Radix=8");
}
else if(num.matches("[0-9]+")){
    System.out.println("Decimal Radix=10");
}
else if(num.matches("[0-9A-F]+"))
{
    System.out.println("Hexadecimal Radix=16");
}
else {
    System.out.println("Invalid Input");
}

// challenge 2

int year;
System.out.println("Enter year");
year = scan.nextInt();

if(year%4 == 0){
    if(year%100 == 0){
      System.out.println("Not a Leap Year");
    }
    else{
        System.out.println("Leap Year");
    }
}
else{
    System.out.println("Not a Leap Year");
}

// class 63 challenge 2
Scanner sc1=new Scanner(System.in);
System.out.println("Enter URL");
String url= sc1.nextLine();

String Protocol=url.substring(0, url.indexOf(":"));

if (Protocol.equals("http")){
    System.out.println("Hyper Text Transfer Protocol");
}
else if(Protocol.equals("ftp")){
    System.out.println("File Transfer Protocol");
}
 String ext=url.substring(url.lastIndexOf(".")+1);
 if (ext.equals("com"))
    System.out.println("Commercial");

   else if (ext.equals("org"))
    System.out.println("Organisation");

   else if (ext.equals("gov"))
    System.out.println("Government");
 
}
}
