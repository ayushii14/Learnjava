public class Method {
       //change element of an array
    void change(int X[],int index,int value){
       X[index]=value;
    }

    //find no. is prime or not
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n/i==0){
                return false;
            }
        }return true;
    }

    //gcd 

static int gcd(int d,int e){
    do{if(d>e){
        d=d-e;
    }
    else{
        e=e-d;
    }
}
    while(e!=d);
    return e;
}
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8,};
        for(int x:A){
            System.out.print(x+" ,");
        }
        System.out.println();
        Method m = new Method();
       m.change(A,1,1);
        for(int x:A){
            System.out.print(x+" ,");
        }


        System.out.println(" ");
        System.out.println(" find no. is prime or not");
        int n=19;
        System.out.println("the number:"+n+" is prime:"+isPrime(19));

        System.out.println(" ");
        int d=25,e=15;
        System.out.println(" find GCD of a given numbers:"+d+","+e);
        System.out.println("GCD is: " +gcd(d,e));


    }
}
