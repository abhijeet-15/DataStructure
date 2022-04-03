package interfaces.extendDemo;

public class Main implements B,A{

    public static void main(String[] args) {
        Main main = new Main();
        A.greeting();
    }

    @Override
    public void greet() {

    }
}
