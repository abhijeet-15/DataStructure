package generic;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull())
            resize();

        data [size++] = num;

    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        // create a temp array of double size
        int[] temp = new int[size * 2];

        //copy the elements from the previous array into this
        for(int i = 0; i < data.length; i++)
            temp[i] = data[i];

        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }


    public static void main(String[] args) {
       // ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();

    }
}
