package Algorithms.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {15,24,1,14};
        int[] a1 = {23,45,1,4,65};
        BubbleSort b = new BubbleSort(a);
        b.bubbleSort(a);

        System.out.println(Arrays.toString(a));

        SelectionSort s = new SelectionSort(a1);
        System.out.println("running selection sort");
        s.selectionSort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
