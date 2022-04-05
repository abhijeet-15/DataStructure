package Algorithms.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {15,24,1,14};
        int[] a1 = {23,45,1,4,65};
        int[] a2 = {34,1,666,33};
        int[] a3 = {2,3,4,1,5};
        BubbleSort b = new BubbleSort(a);
        b.bubbleSort(a);

        System.out.println(Arrays.toString(a));

        SelectionSort s = new SelectionSort(a1);
        System.out.println("running selection sort");
        s.selectionSort(a1);
        System.out.println(Arrays.toString(a1));

        InsertionSort i = new InsertionSort(a2);
        i.insertionSort(a2);

        System.out.println("running insertion sort");
        System.out.println(Arrays.toString(a2));

        System.out.println("running cycle sort");

        CycleSort cycleSort = new CycleSort(a3);
        cycleSort.cycleSort(a3);
        System.out.println(Arrays.toString(a3));
    }
}
