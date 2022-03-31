package Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
       // this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);

    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull())
            return false;
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
      if(isEmpty())
          throw new StackException("Cannot pop-up from empty stack");
      return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty())
            throw new StackException("Cannot peek from empty stack");
        return data[ptr];

    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull(){
       return ptr == data.length -1;
    }

}
