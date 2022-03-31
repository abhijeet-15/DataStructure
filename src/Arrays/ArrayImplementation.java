// Abhijeet Singh - 26th March 2022

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImplementation {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int [10]; // on a 32-bit system, 10*4 byte of memory
       array = insert(array);
       // Arrays.binarySearch(array,3);

    }

    // insert into array
    static int[] insert(int [] array){
        ArrayImplementation arrayImplementation = new ArrayImplementation();
        System.out.println("Insert element into the array...");
        for(int i=0; i< array.length; i++){
            array[i] = arrayImplementation.scanner.nextInt();
        }
        return array;
    }

    // delete
    static int[] delete(int [] array) {
        ArrayImplementation arrayImplementation = new ArrayImplementation();
        System.out.println("Enter the index that you want to delete between 0 -9");
        int index = arrayImplementation.scanner.nextInt();

        //valid index
        if (index > -1 && index > array.length) {
             int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++, j++) {
                if (index == i) {
                    j = j - 1;
                    continue;
                }
                newArray[j] = array[i];
            }
            return newArray;
        }
        //invalid index
        else
            System.out.println("invalid index..terminating deletion");
        return array;
    }

}
