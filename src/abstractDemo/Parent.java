package abstractDemo;

abstract public class Parent {
    int age;
    final int COUNT;

    public Parent(int age){
        this.age = age;
        COUNT = 23454555;
    }

    abstract void career();
    abstract void partner();

    // not allowed - abstract method need to be overridden and static cannot be overridden so essentially useless.
    //abstract static void family();

    static String hello(){
        return "hello";
    }

    // allowed because child class object can call it
    public void normal(){
        System.out.println("This is a normal function");

    }
}
