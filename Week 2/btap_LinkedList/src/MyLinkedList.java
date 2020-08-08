

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
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
        Node current = head;
        Node del;

        for (int i=0;i<index-1;i++){
            current = current.next;
        }

        del = current.next;

        current.next =del.next;
        numNodes--;

        return (E) del.data;

    }

//    public boolean remove(Object e){
//        Node current = head;
//
//    }
//
//    public int size(){}
//
//    public E clone(){}
//
//    public boolean contains (E o){}
//
//    public int add(E e){}
//
//    public void ensureCapacity(int minCapacity){}
//
    public E get(int index){
        Node temp = head;
        for (int  j =0;j<index;j++){
            temp = temp.next;
        }
        return (E) temp;
    }
//
//    public E getFirst(){}
//
//    public E getLast(){}
//
//    public void clear(){}
//
//


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
