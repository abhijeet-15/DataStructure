package cloning;

public class Human {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        //for primitives new ones are created but for non-primitives new ones are not created
//        // it just points to the same reference variables
//        //therefore any change made in twin.nonprimitive updates the origina.primitive as well
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone(); // this is actually a shallow copy

        twin.arr = new int[twin.arr.length];
        for(int i = 0;  i < twin.arr.length; i++ ){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
