package Algorithms.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {15,24,1,14};
        BubbleSort b = new BubbleSort(a);
        b.bubbleSort(a);

        System.out.println(Arrays.toString(a));
    }
}
