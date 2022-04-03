package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(27);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(29);
        daughter.career();

        System.out.println("Daughet's age is " + daughter.age);
        System.out.println("Son's age is " + son.age);

        System.out.println(Parent.hello());

        Parent parent = new Son(28); // allowed because of run time polymorphism
        parent.career();

       // parent.onlySon(); // this is because what can be called depend on left side and it does not have it. What is called depends
                          //on right hand side
        son.onlySon();

    }

}
