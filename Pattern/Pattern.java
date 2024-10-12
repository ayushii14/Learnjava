import java.util.Scanner;

public class Pattern {
    /**
     * @param args
     */
    public static void main(String args[]) {

        // class78
        // #2

        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + ",");
            }
            System.out.println("");
        }
        System.out.println(" ");
        // #3
        System.out.println("pattern 2");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }

        // #4
        System.out.println(" ");
        System.out.println("Pattern 3");
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%02d", count);
                System.out.print(" ");

            }
            System.out.println(" ");
        }

        // #5
        System.out.println(" ");
        System.out.println("Pattern 4");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        //#6
        System.out.println(" ");
        System.out.println("Pattern 5");
        int c=0;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                c++;
                System.out.format("%02d", c);
                System.out.print(" ");
            }
            System.out.println();
        }
        

        //class 80
        System.out.println();
        System.out.println("Pattern 6");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                //space
System.out.print(" "); }
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 7");
        for(int i=1;i<=5;i++) {
for(int j=1;j<=5-i;j++){
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println("");
        }



        //#8
        System.out.println();
        System.out.println("Pattern 8");
        //part1
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=i-1;j++){
        System.out.print("*");
      }
      System.out.println("");
        } 
        //part2
        for(int i=5;i>1;i--){
            for(int j=1; j<=5-i;j++){
                //space 
                System.out.print(" "); }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-2;j++){
                System.out.print("*");
            }
            System.out.println("");
        }



        //#9
        System.out.println();
        System.out.println("Pattern 9");
//part1
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++ ){
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
    System.out.print("*");
}
for(int j=1;j<=i-1;j++){
    System.out.print("*");
}
System.out.println();
}
//part2
for(int i=4;i>=1;i--){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
