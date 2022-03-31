package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(14);
        list.insertFirst(24);
        list.insertFirst(15);

        //list.display();
        list.insertLast(12);

       // list.display();

        list.insert(100,3);
        list.display();

       System.out.println(list.deleteFirst());
       list.display();

        System.out.println(list.deleteLast());
        list.display();

        DLL dlist = new DLL();
        dlist.insertFirst(1);
        dlist.insertFirst(14);

      //  dlist.display();
        dlist.displayReverse();

    }
}
