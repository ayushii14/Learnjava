public class variableArgu {
   static int max(int ...A){
      if(A.length==0){
        return Integer.MIN_VALUE;
      }
      int m=A[0];
      for(int i=1;i<A.length;i++){
        if(A[i]>m){
            m=A[i];
        }
      }
      return m;
    }

    static int Sum(int ...B){
      if(B.length==0){
        return Integer.MIN_VALUE;
      }
      int sum=0;
      for(int i=0;i<B.length;i++){
        sum=sum+B[i];
      }
      return sum;
    }

     
  static  double discount(double ...P){
      if(P.length==0){
        return 0.0;
        }
        //sum
        double s=0;
      for(int i=0;i<P.length;i++){
        s=s+P[i];
      }
      System.out.println("total bill is: "+s);
      if(s<500) return s*0.10;
      else if(s>500&&s<1000) return s*0.15;
      else  return s*0.20;
    }
    public static void main(String ...args){
      System.out.print(" max out of these number:3,4,5,2,9,6 is: ");
      System.out.println( max(3,4,5,2,9,6));

      System.out.print(" Sum of these number:3,4,5,2,9,6 is: ");
      System.out.println( Sum(3,4,5,2,9,6));
      System.out.print(" Sum of zero number:is: ");
      System.out.println( Sum());
      System.out.print(" Sum of these number:3 is: ");
      System.out.println( Sum(3));

      System.out.println("Discount on the total price is: "+discount(34,50,59));
    }
}
