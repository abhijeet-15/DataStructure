package Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        // this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length -1;
    }

    public boolean insert(int item){
        if(isFull())
            return false;
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty())
           throw new Exception("cant remove from empty stack");

        int removed = data[0];
//        for(int i = 0; i< data.length -2; i++)
//            data[i] = data[i+1];
        for(int i = 1; i < end; i++)
            data[i-1] = data[i];
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty())
            throw new Exception("Nothing in the queue");
        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

}
