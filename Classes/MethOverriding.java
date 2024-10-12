package Classes;

class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }
    
    public void changeChannel() { System.out.println("TV Channel is Changed"); }
    
}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("SmartTV is Switched ON"); }
    
    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    
    public void browse(){ System.out.println("SmartTV Browsing"); }
    
}

public class MethOverriding {
    public static void main(String[] args) 
    {
        TV t=new TV();
        System.out.println("Methods of TV");
        t.switchON();
        t.changeChannel();
        System.out.println();

        SmartTV t2=new SmartTV();
        System.out.println("Methods of SmartTV");
        t2.switchON();
        t2.changeChannel();
        t2.browse();
        System.out.println();

        TV t1=new SmartTV();
        System.out.println("Methods of TV acc to SmartTV");
        t1.switchON();
        t1.changeChannel();
        
    } 
}
