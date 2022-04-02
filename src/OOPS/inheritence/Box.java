package OOPS.inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l= side;
        this.w = side;
        this.h = side;
    }

    //cuboid
    Box(double l, double h, double w){
        this.l = l;
        this.h= h;
        this.w = w;
    }

    //copy constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w= old.w;
    }

    public void information(){
        System.out.println("Creating the box");
    }
    public void introduction(){
        System.out.println("I am box");
    }


}
