package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int [] sortedArray, int left, int right, int key){

        if(right >= left){
            int mid = left + (right - left)/2;

            if(sortedArray[mid] == key)
                return mid;
                //System.out.println("Element found at " + mid);




            if(sortedArray[mid] > key)
                return binarySearch(sortedArray,left,mid-1,key);

            if(sortedArray[mid] < key)
                return binarySearch(sortedArray,mid +1, right,key);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[5];

        for(int i =0 ;i< sortedArray.length; i++)
            sortedArray[i] = 10*i;
//            sortedArray[i] = (int)Math.random();

        System.out.print(Arrays.toString(sortedArray));
        System.out.println(" ");
        System.out.println("Enter the key to be searched..");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int n = sortedArray.length;

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(sortedArray,0,sortedArray.length-1,key);

    }
}
