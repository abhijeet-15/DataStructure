package OOPS.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h+ " "+box.w);
        Box box2 = new Box(box);

        BoxWeight box3 = new BoxWeight();
        box3.introduction();

        Box box5 = new BoxWeight(2,3,4,5);
       // System.out.println(box5.weight) --> not allowed because it is type of reference variable and not the
       // object that determines what members can be accessed.


        // There are many variables in both parent and child class
        //access is given to variables that are in the reference type i.e. BoxWeight
        //hence, you should have access to weight variables
        // this also means the ones you are trying to access (weight) here should be initialised
        // but here if the object itself is of parent class, how will you call the constructor of child class

        //BoxWithWeight box6 = new Box(2,3,3);


        //BoxWithWeight box7 = (BoxWithWeight) new Box(2,3,3); // run time error
        //System.out.println("for box7, weight is  " + box7.weight);

        BoxPrice boxPrice = new BoxPrice(2,3,4,5,20);
        System.out.println("calling box intro method from box price");
        boxPrice.introduction();

    }
}
