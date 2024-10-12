
package Classes;

class Subject {
    private String subID;
    private String subName;
    private double maxMarks;
    private double marksObtain;

    public Subject(String subID, String subName) {
        this.subID = subID;
        this.subName = subName;
    }

    public Subject(String subID, String subName, double maxMarks, double marksObtain) {
        this.subID = subID;
        this.subName = subName;
        setMaxMarks(maxMarks);
        setMarksObtain(marksObtain);
    }

    public String getSubID() {
        return subID;
    }

    public String getSubName() {
        return subName;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public double getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(double maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(double marksObtain) {
        this.marksObtain = marksObtain;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+subName+"\n MarksObtained "+marksObtain;
    }

}

public class Constructors2 {

    public static void main(String[] args) {
        Subject sbj = new Subject("ENG01", "English");
        sbj.setMaxMarks(100.0);
        sbj.setMarksObtain(90.0);
        System.out.println(sbj.getSubID());
        System.out.println(sbj.getSubName());
        System.out.print(sbj.getMarksObtain() + "/");
        System.out.println(sbj.getMaxMarks());

        // Subject s=new Subject("ENG01", "English",100,80);
//array of an object
Subject subs[] = new Subject[3];
subs[0]=new Subject("S101","DSA",100.0,50.0);
subs[1]=new Subject("S102","DBMS",100.0,60.0);
subs[2]=new Subject("S103","OS",100.0,40.0);

for(Subject s:subs){
    System.out.println(s);
}
System.out.println();
    }
}
