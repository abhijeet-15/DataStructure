package generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i < 5; i++){
            list.add( i + 6);
        }

        list.forEach((item)-> System.out.println(item));

        // same thing using consumer
        Consumer<Integer> fun = (item)-> System.out.println(item);
        list.forEach(fun);

        // another way to write the same
        Operation su1m = Integer::sum;

        Operation sum = (a,b) -> a + b;
        Operation diff = (a,b) -> a-b;
        Operation product = (a,b) -> a * b;
        // see above
        //lambda expressions can be assigned to variables of interface type

        LambdaFunctions cal = new LambdaFunctions();
        System.out.println(cal.operate(5,3,sum));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

//for more than one parameter
interface Operation {
    int operation(int a, int b);
}
