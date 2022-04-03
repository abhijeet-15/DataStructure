package abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
       // this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be rich");

    }

    @Override
    void partner() {
        System.out.println("I'll get married after my house is built");

    }

    public boolean onlySon(){
        return true;
    }
}

