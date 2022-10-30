
class Person {
    String name;
    int weight;

    void eat() {
        weight++;
    }

    void run() {
        weight--;
    }
}

public class Appcopycopycopy {

    public static void main(String[] args) throws Exception {
        Person YEH = new Person();
        YEH.name = "葉宸佑";
        YEH.weight = 100;
        YEH.eat();
        System.out.println(YEH.name);
        System.out.println(YEH.weight);
    }
}
