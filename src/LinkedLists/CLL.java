package LinkedLists;

public class CLL {
    int size;
    private Node head;
    private Node tail;

    public CLL(){
        this.head = head;
        this.tail = tail;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next= head;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if(node == null)
            return;

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public void display(){
        Node node = head;

        if(head !=null){
            do{
                System.out.print( node.value + " -> ");
                node = node.next;
            }while (node != head);
        }
    }

    private class Node{
        int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
