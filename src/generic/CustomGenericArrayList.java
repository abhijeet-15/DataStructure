package generic;
import java.util.ArrayList;

public class CustomGenericArrayList<T> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomGenericArrayList(){
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if(isFull())
                resize();

            data [size++] = num;

        }

        private boolean isFull(){
            return size == data.length;
        }

        private void resize(){
            // create a temp array of double size
            Object[] temp = new Object[size * 2];

            //copy the elements from the previous array into this
            for(int i = 0; i < data.length; i++)
                temp[i] = data[i];

            data = temp;
        }

        public T remove(){
            T removed = (T)data[--size];
            return removed;
        }

        public T get(int index){
            return (T)data[index];
        }

        public int size(){
            return size;
        }

        public void set(int index, int value){
            data[index] = value;
        }


        public static void main(String[] args) {
            // ArrayList list = new ArrayList();
            CustomGenericArrayList<Integer> list1 = new CustomGenericArrayList<>();
            list1.add(1);
           // list1.add("abaha");

        }


}
