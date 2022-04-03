package interfaces.extendDemo;

public interface A {

    //static interface methods should always have a body
    //and are called via interface name
    static void greeting(){
        System.out.println("Greeting from class A, I'm a static method");
    }


    default void fun(){
        System.out.println("I'm in A");
    }

}
