package OOPS.access;

public class SubClass extends A{
    public SubClass(int num, String name){
        super(10,"abhi");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(15,"Abh");
        int a = subClass.num; // accessible

        SubClass1 subClass1 = new SubClass1();
        int b = subClass1.num; //accessible



    }
}

class SubClass1 extends SubClass{
    public SubClass1(){
        super(10,"abhi");
    }
}

class SubClass2 extends A{
    public SubClass2(){
        super(10,"jeet");
    }
}

