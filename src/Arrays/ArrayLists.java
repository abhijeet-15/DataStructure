package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //insert array into element
        list.add(1);
        list.add(14);
        list.add(24);

        //look
       System.out.println(list.get(2));

       //delete
        list.remove(1);



    }
}
