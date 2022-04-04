package Algorithms.sorting;

public class BubbleSort {
    int a[];
    public BubbleSort(int a[]){
        this.a = a;
    }

    protected void bubbleSort(int a[]){
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i < a.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j= 1; j < a.length - i; j++){
                //swap if the item is smaller than the previous item
                if(a[j] < a[j -1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swapped = true;
                }
            }
            // if no swap made for a particular cycle means the array is sorted
            if(!swapped)
                break;
        }
    }
}
