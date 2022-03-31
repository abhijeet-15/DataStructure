package LinkedLists;

public class DLL {
    int size;
    Node head;
    //Node tail;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value= value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null)
            head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        if(head == null){
            node.next = null;
            head = node;
            size++;
            return;
        }
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public void insertAfterValue(int after, int value){
        Node p= find(after);

        if(p == null){
            System.out.println("Value does not exists");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.prev != null)
            node.next.prev = node;


    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(" <- " + temp.value + " ->");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public void displayReverse(){
        Node node = head;
        Node last = null;
        while(node != null)
            last = node;
        System.out.println("Print in reverse order");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println(" ");
    }




}
