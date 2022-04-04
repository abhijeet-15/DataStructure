package Algorithms.sorting;

public class InsertionSort {
    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    protected void insertionSort(int[] arr){
        //run till arr.length -2
        for(int i = 0; i < arr.length -1;i++){

            // keep sorting left
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else
                    break;
            }
        }
    }

    protected void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}
