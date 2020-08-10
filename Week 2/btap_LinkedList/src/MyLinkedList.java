

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
        Node newNode = new Node(e);
        Node temp = head;
        newNode.next = temp;
        newNode.next = head;
        numNodes++;

    }

    public void addLast(E e){
        Node newNode =new Node(e);
        Node temp = head;
        temp.next = newNode;
        numNodes++;
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

    public void remove(Object e){
        Node current = head;
        Node del;
        if (current==e){
            current=null;

        }

        while (current.next != null){

            if (current.next==e){
                del = current.next;
                current.next = del.next;
            }
        }

    }

    public int size(){
        Node current = head;
        int size=0;
        while (current.next.data!=null){
            size++;
        }
        return size;
    }

    public E clone(){
        Node current = head;
        Object listNode2 = new Node2();
        while(current.next!=null){
           listNode2= current.next.getData();
        }
        return (E) listNode2;
    }

   public boolean contains (E o){
        Node current = head;
        while(current.next != null){
            current = current.next;
            if (current.getData()==o) return true;


        }   return false;

   }



//    public void ensureCapacity(int minCapacity){}
//
    public E get(int index){
        Node temp = head;
        for (int  j =0;j<index;j++){
            temp = temp.next;
        }
        return (E) temp.getData();
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

    private class Node2 {
        private Node2 next;
        private Object data;

        public Node2(){}

        public Node2(Object data){this.data = data;
        }

        public Object getDataNode2(){
            return this.data;
        }
    }
}
