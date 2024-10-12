public class Patternque {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        System.out.println("\nPattern 1: ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
                 }
                 System.out.println();
        }

        //pattern 2
        System.out.println("\nPattern 2: ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
             if(i== 1||j==1||i==n||j==m){
                System.out.print("*");
             }
else{
    System.out.print(" ");}
} System.out.println();
            }

            //pattern 3
            System.out.println("\nPattern 3: ");
        for(int i=1;i<=n;i++){
            for(int c=1;c<=i;c++){
                System.out.print("*");
            } System.out.println("");
        }

        //pattern 4
        System.out.println("\nPattern 4: ");
        for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
    System.out.print("*");
}System.out.println();
        }


        //pattern 5
        System.out.println("\nPattern 5: ");
        for(int i=1;i<=n;i++){
            
            //inner loop-> space
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } System.out.println();
        }

  //pattern 6
  System.out.println("\nPattern 6: ");
  for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }System.out.println();
  }

  //pattern 7
  System.out.println("\nPattern 7: ");
  for(int i=5;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }System.out.println();
  }

  //pattern 8
  System.err.println("\nPattern 8: ");
  int number=1;
  for(int i=1; i<=5; i++){
    for(int j=1; j<=i; j++) {
        System.out.print(number+" ");
        number++;
    }System.out.println();
  }
  
//pattern 9
System.out.println("\nPattern 9: ");
for(int i=1; i<=5; i++){

    for(int j=1; j<=i;j++){
        int sum=i+j;
        if (sum % 2==0){ //even
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
    }System.out.println();
}






        }
    }
