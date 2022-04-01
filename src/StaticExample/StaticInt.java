package StaticExample;

//this is a demo to show intialization of static methods
public class StaticInt {
    static int a = 15;
    static int b;

    static{
        System.out.println("inside static block");
        b = a *5;
    }

    public static void main(String[] args) {
        System.out.println("inside main");
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b+= 3;
    }
}
