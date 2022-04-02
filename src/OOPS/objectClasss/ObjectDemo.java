package OOPS.objectClasss;

import java.util.Arrays;

public class ObjectDemo {
    int num;
    int val;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectDemo objectDemo = new ObjectDemo(15);
        ObjectDemo objectDemo1 = objectDemo;
        ObjectDemo objectDemo2 = new ObjectDemo(15);
        System.out.println("hashcode override method " +objectDemo.hashCode());
        System.out.println("equals override method " + objectDemo.equals(objectDemo1)); // true expected
        System.out.println(" second equals override method "+ objectDemo.equals(objectDemo2)); // false
       // System.out.println("calling clone method "+ objectDemo.clone());
        System.out.println("calling getClass method"+objectDemo.getClass());

        if(objectDemo instanceof ObjectDemo)
            System.out.println("Yes it is the object of same class");




    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
