package Classes;


class Parent {
    Parent(){
System.out.println("non-param of parent");}
Parent(int x){ System.out.println("param of parent"+x);}
}

class Child extends Parent{
    Child(){System.out.println("non-param of child");}
    Child(int y){System.out.println("param of child");}
    Child(int x,int y){
        super(x);
        System.out.println("2param of child "+y);
    }
}
public class Constructor3 {
    public static void main(String[] args) {
        Child c=new Child(10);
        Child c1=new Child(10,20);
    }
}
