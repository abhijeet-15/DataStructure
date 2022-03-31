package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {

    }

    int LinearSearch(int[] array, int key){
        for(int nums: array){
            if(nums == key)
                return 1;
        }
        return -1;
    }
}
