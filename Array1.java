
public class Array1 {
    public static void main(String[] args) {
        // sum of elements
        int A[] = { 1, 4, 3, 18, 5 };
        int sum = 0;
        for (int x : A) {
            System.out.print(x + ",");
            sum = sum + x;
        }
        System.out.println();
        System.out.println(" Sum is: " + sum);

        // search a element
        System.out.println();
         System.out.println("searching element");
        int m = 4;
        System.out.println("key is: " + m);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == m) {

                System.out.println("Key found at index: " + i);
                //System.exit(o);
                break;
            }
        }
        System.out.println("Not found");

        // 3
        System.out.println();
        System.out.println("Finding max element");
        
        int B[]={1,6,8,12,4};
        int max = B[0];
        for (int j = 0; j < B.length; j++) {
            if (B[j] > max) {
                max = B[j];
            }
        }
        System.out.println("max element : " + max);



        System.out.println();
        System.out.println("Find the second max element");
        int C[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        max1=max2=C[0];
        for(int i=0;i<C.length;i++){
            if(C[i]>max1){
                max2=max1;
                max1=C[i];
            }
            else if(C[i]>max2){
                max2=C[i];
            }
        }
        System.out.println("Second Largest Element is: "+max2);
    }
}
