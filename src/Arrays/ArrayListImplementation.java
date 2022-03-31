package Arrays;

import java.util.ArrayList;

public class ArrayListImplementation {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
       for(int i =0 ;i < 10; i++)
           arrayList.add(i+10);

       for (int i=0;i< arrayList.size();i++)
           System.out.println("Element at index " +i+ " is " + arrayList.get(i));
    }
}
