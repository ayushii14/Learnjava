public class AdvPattern {

    public static void main(String[] args) {
        int n = 5;
        //pattern 10
        System.out.println("\nPattern 10:Butterfly Pattern ");
        // upper half
        for (int i = 1; i <= n; i++) {

            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lowerhalf 
        for (int i = n; i >=1; i--) {

            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //pattern 11
        System.out.println("\nPattern 11:Solid Rhombus ");
        for(int i=1;i<=n;i++){
            //spaces
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
        }
        //stars
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }

//pattern 12
System.out.println("\nPattern 12:Number Pyramid");
for(int i=1;i<=n;i++){
            //spaces
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

//pattern 13
System.out.println("\nPattern 13:Palindromic Pattern");
for(int i=1;i<=5;i++){

    //spaces
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
    }
    //firsthalf nto1
    for(int j=i;j>=1;j--){
        System.out.print(j);
    }
    for(int j=2;j<=i;j++){
        System.out.print(j);
    }System.out.println();
}

//pattern 14
System.out.println("\nPattern 14:Diamond pattern");
//upper half
for(int i=1;i<=n;i++){
    //space
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");}
        
        //first-half
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    //second-half
    for(int j=2;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }
    //lower half
for(int i=n;i>=1;i--){
    //space
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");}
        
        //first-half
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    //second-half
    for(int j=2;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }


}
 }

