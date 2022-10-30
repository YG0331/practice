package tw.nkust.ic.Yeh;

public class Teacher extends People {
    public String tid;

    public Teacher(String name,int age,String tid){
        super(name, age);
        this.tid=tid;
    }
}
