public class Array3 {
    public static void main(String args[]){

        //adding two matrix
        System.out.println("adding two matrix ");
        int [] A [] = {{1,2,3},{4,5,6},{7,8,9}};
        int [] B [] = {{1,2,3},{4,5,6},{7,8,9}};
        int C[][]=new int [3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        for(int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
        

         //multiplying two matrix

         System.out.println(" ");
         System.out.println("multiplying two matrix ");
         
         int [] D [] = {{1,2,3},{4,5,6},{7,8,9}};
        int [] E [] = {{1,0,0},{0,1,0},{0,0,1}};
        int F[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                F[i][j]=0;
                for(int k=0;k<3;k++){
                    F[i][j]=F[i][j]+D[i][k]*E[k][j];
                }
            }
            
        }
        for(int x[]:F){
            for(int y:x){
                System.out.print(y+" ");
            }
        System.out.println(" ");
        }
    }
}
