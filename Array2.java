public class Array2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // rotation of array
        int A[] = { 4, 7, 3, 5, 9, 10, 78, 45 };
        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
        for (int x : A) {
            System.out.print(x + ", ");

        }
        System.out.println();

        // insertion
        System.out.println();
        System.out.println("Inserting an element");
        int B[] = new int[10];
        B[0] = 5;
        B[1] = 9;
        B[2] = 10;
        B[3] = 78;
        B[4] = 45;
        B[5] = 4;
        for (int x : B) {
            System.out.print(x + ",");
        }
        int n = 6;
        int index = 2;
        for (int i = n; i >= index; i--) {
            B[i] = B[i - 1];
        }

        B[2] = 15;
        System.out.println();
        for (int x : B) {
            System.out.print(x + ",");
        } System.out.println();

        // deletion
        System.out.println();
        System.out.println("Deleting an element");
        for (int x : B) {
            System.out.print(x + ",");
        }
        int ind = 1;
        for (int i = ind; i < B.length - 1; i++) {
           B[i]=B[i+1];
        }
        System.out.println();
        for (int x : B) {
            System.out.print(x + ",");
        }


        // copying an array
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("copying an array");
        int a[]={4,5,7,8,10,11};
        int b[]=new int[10];
        for (int y : a) {
            System.out.print(y + ",");
        }
       
        for(int i=0;i<=a.length-1;i++){
        b[i]=a[i];
            }
        System.out.println();
        System.out.println("after copying array ");
        for (int m : b) {
            System.out.print( m+ ",");
        }


        //reverse copying
        System.out.println();
        System.out.println();
        System.out.println("reverse copying an array");
    
        int c[]=new int[6];
        System.out.print("initial array is:");
        for (int y : a) {
            System.out.print(y + ",");
        }
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            c[j]=a[i];
        }
        System.out.println();
        System.out.print("Reversed array is:");
        for(int x:c){
            System.out.print(x+",");
        }

//increasing the size of an array
System.out.println();
System.out.println();
System.out.println("increasing the size of an array");
        int d[]={8,6,10,9,2};
        for(int x:d){
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println("Length of d="+d.length);
        
        int e[]=new int[10];
        
        for(int i=0;i<d.length;i++)
        {
            e[i]=d[i];
        }
        d=e;
        System.out.println();
        System.out.print("new array: ");
        for(int x:d){
            System.out.print(x+",");
        }System.out.println();
        System.out.println("Length of d="+d.length);
        
    }
}
