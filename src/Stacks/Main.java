package Stacks;

public class Main{
    public static void main(String[] args) throws StackException {
        CustomStack customStack = new CustomStack(5);

        customStack.push(1);
        customStack.push(14);
        customStack.push(24);
        customStack.push(15);
        customStack.push(18);
        customStack.pop();
        customStack.peek();
    }

}
