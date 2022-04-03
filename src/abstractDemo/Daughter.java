package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'll be a teacher");


    }

    @Override
    void partner() {
        System.out.println("I'll be marry before 30");

    }
}
