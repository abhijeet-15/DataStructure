package OOPS.polymorphism;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Circle circle1 = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        CompileTime compileTime = new CompileTime();

        square.area(); // runtime polymorphism

        compileTime.sum(2,3); // compile time polymorphism
        compileTime.sum(1,2,4);// compile time polymorphism


        circle.area();
        circle1.noNeedTobeInChildClass();



    }
}
