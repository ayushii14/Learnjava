import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args) {
        //Getbit  //here index counting starts from left hand side
        int n=5; 
        int pos=3;

        int bitMask=1<<pos;
        if((bitMask & n) ==0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");
        }

        //setbit
        int m=5; //0101
        int pos1=1;
        int bitMask1=1<<pos1;
        int newNumber= bitMask1 | m;
        System.out.println(newNumber);//0111

        //clearbit
        int k =5;//0101
        int pos2=2;
        int bitMask2=1<<pos2;  //bitmask=1<<pos
        int clearNumber= ~bitMask2 & k ;  //operation: AND with NOT of bitmask
        System.out.println(clearNumber);//0001

/***Updatebit
 here there are 2 conditions
 1)for 0 (clearbit)
 1<<pos
 AND with NOT of bitmask
 2)for 1(setbit)
 1<<pos
 OR***/
Scanner sc=new Scanner(System.in);
System.out.println("Which operation is to be performed: ");
int operation=sc.nextInt();

 int o=5; //0101
 int pos3=1;
 int bitMask3= 1<<pos3;
 if(operation==1){
 int  updateNumber= bitMask3 | o;
 System.out.println(updateNumber);//0111
}else{
    int updateNumber= ~bitMask3 & o;
    System.out.println(updateNumber);//0101
}
    }
}
