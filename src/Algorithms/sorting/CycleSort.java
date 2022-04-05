package Algorithms.sorting;

public class CycleSort {
    int[] arr;

    public CycleSort(int[] arr){
        this.arr = arr;
    }

    protected void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
    }

    protected void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int missing =0;
        int n = nums.length;
        n =((n+1)*n)/2;

        for(int i = 0; i < nums.length; i++)
            missing += nums[i];

        return n-missing;

    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
                i++;
        }

        for(int j = 0 ; j < nums.length; j++ ){
            if(nums[j] != j+1)
                return nums[j];
        }

        return -1;
    }
}