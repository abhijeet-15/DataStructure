package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;

        try{
            System.out.println("inside try block");
            divide(a,b);

        }catch (Exception e){
            System.out.println("exception occurred. inside catch block");
            System.out.println(e);
        }finally {
            System.out.println("Inside finally. This is always going to execute");
        }
    }

    static int divide (int a, int b) throws ArithmeticException{
        if(b == 0)
            throw new ArithmeticException("cannot divide by zero");
        return a/b;
    }
}
