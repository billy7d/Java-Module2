

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(){

    }

    public void add(int index, E element){
        Node current = head;
        Node holder;

        for (int i=0;i<index -1;i++){
            current = current.next;
        }
        holder = current.next;
        current.next = new Node(element);
        current.next.next = holder;
        numNodes++;

    }

    public void addFirst(E e){

    }

    public void addLast(E e){

    }

    public E remove (int index){


    }

    public boolean remove(Object e){

    }

    public int size(){}

    public E clone(){}

    public boolean contains (E o){}

    public int add(E e){}

    public void ensureCapacity(int minCapacity){}

    public E get(int i){}

    public E getFirst(){}

    public E getLast(){}

    public void clear(){}





    private class Node {
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
