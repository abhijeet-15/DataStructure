package Algorithms.sorting;

public class SelectionSort {
    int[] a;

    public SelectionSort(int[] a){
        this.a  = a;
    }

    protected void selectionSort(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            int last = arr.length - i - 1;

            //find max index in the remaining array and swap with correct index
            int maxIndex = getMaxIndex(arr,0,last);

            //push the maxIndex element to end i.e. swap
            swap(arr,maxIndex,last);
        }
    }

    protected int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <=end; i++){
            if(arr[max] < arr[i])
                max = i;
        }

        return max;

    }

    protected void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
