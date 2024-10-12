public class Method2 {
   static int max(int x,int y){
        if(x>y){
            return x;
        }else
        return y;
    } 
   static int max(int x,int y,int z){
        if(x>y & x>z){
            return x;
        }
        else if(y>x & y>z){
            return y;
        }   
      return z; 
    }

   static float max(float h,float j){
        if(h>j){
            return h;
            }else
           return j;
    }

    //area of rec
   static double area(double x, double y){
        return x*y;
    }
    //area of circle
   static double area(double r){
        return Math.PI*r*r;
    }

    //reverse a number 
   static  int  reverse(int n){
    int rev=0;
    while(n>0){
        rev=rev*10+n%10;
        n=n/10;
    }
    return rev;
   }
   //reverse an array
   static void reverse(int arr[], int rev[]){   //int[] can be return type but if we give return rev then it returns the code of the array not the actual array,so instead we printed the array here itself and simply called the array in the main method without s.o.pln
    for(int i=arr.length-1,j=0;i>=0;i--,j++){
        rev[j]=arr[i];
   }
   for(int x:rev){
    System.out.print(x+" ");
   }
  // return rev;
  
}
    public static void main(String[] args) {
        int x=5,y=8,z=3;
        System.out.println("max of x and y is "+max(x,y));
        System.out.println("max out of three is: "+max(x,y,z));
        System.out.println("max of x and y is "+max(1.5f,2.4f));
        System.out.println("area of circle is "+area(2f));
        System.out.println("area of rectangle is "+area(x,y));


        System.out.println("reversed number is: "+reverse(234));
        int arr[]={1,2,3,4,5};
        int rev[]=new int[arr.length];
        System.out.print("reversed array is: ");
        reverse(arr,rev);

    }
}

