package tw.nkust.ic.Yeh;

public class Student extends People {
    public String sid;

    public Student(String name,int age,String sid){
        super(name, age);
        this.sid=sid;
    }

}
