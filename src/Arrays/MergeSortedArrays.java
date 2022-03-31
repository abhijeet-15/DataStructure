package Arrays;


import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of first array");
        int l1 = scanner.nextInt();
        System.out.println("Enter length of second array");
        int l2 = scanner.nextInt();

        int[] a1 = new int[l1];
        int[] a2 = new int[l2];

        System.out.println("Enter the array 1");
        //read the array

        for(int i=0;i<l1;i++) // O(a)
            a1[i] = scanner.nextInt();
        for(int i=0;i<l2;i++) //
            a2[i] = scanner.nextInt();

        int l3 = l1+l2;
        int[] a3 = new int [l3];

        // merge the two arrays

       int i=0,j=0,k=0;
       while (i < l1 && j < l2){
//           System.out.println("The first while loop");
//           System.out.println(" i is " + i);
//           System.out.println("j is " + j);
           if(a1[i] <= a2 [j]){
               a3[k] = a1[i];
               i++;
           }
           else{
               a3[k] = a2[j];
               j++;
           }
           k++;
       }

       while(i < l1){
           System.out.println("Second while loop");
           a3[k] = a1[i];
           i++;
           k++;
       }

       while(j <l2){
           System.out.println("Third while loop");
           a3[k] = a2[j];
           j++;
           k++;
       }

       System.out.println("New merged array is ");

       for(int o =0;o<a3.length;o++){
           System.out.println(a3[o]);
       }
    }
}
