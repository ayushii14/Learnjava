import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * int size=sc.nextInt();
         * int numbers[]= new int[size];
         * //input
         * for(int i=0;i<size;i++){
         * numbers[i]=sc.nextInt();
         * }
         * 
         * System.out.println("enter number whos index is to be find: ");
         * int x=sc.nextInt(); //number whos index is to be find
         * 
         * //output
         * for(int i=0;i<numbers.length;i++){
         * if(numbers[i]==x){
         * System.out.println("index of element "+x+ " is: "+i);
         * }
         * }
         * 
         * for(int j=0;j<size;j++){
         * System.out.println("Element at index "+j+" is: "+numbers[j]);
         * }
         **/

        // 2D ARRAYS
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // element index find
        System.out.println("enter an element whos index is to be found: ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Index of element " + x + " is: (" + i + "," + j + ")");
                }
            }
        }
    }
}
