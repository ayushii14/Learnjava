import java.lang.String;

class StringPractice{
    
    public static void main(String arg[])
    {
      String str=new String("vscode");
      int len=str.length();
      System.out.println(len);


      String str1=str.toUpperCase();
      System.out.println(str1);


      String str2=new String("    MEENA   ");
      System.out.println(str2);


      str2=str2.trim();
      System.out.println(str2);


       String str3=str2.substring(1, 4);
      System.out.println(str3);


      str2=str2.replace('E','I');
      System.out.println(str2);

      str2=str2.toLowerCase();
      System.out.println(str2);

    
    }
}


