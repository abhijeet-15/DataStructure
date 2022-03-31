package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i <7; i++)
            array[i] = 0;
        array[8] = 3;
        array[7] =111;
        array[9] = 9;



       Set<Integer> duplicateEntry = new HashSet<>();

       for(int i = 0; i< array.length; i++){
           if(duplicateEntry.contains(array[i])){
               System.out.println(array[i]);
               break;
           }
           duplicateEntry.add(array[i]);
       }

    }


}
