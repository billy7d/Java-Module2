public class MyList<E> {

    private int size = 0;
    private  static  final int DEFAULT_CAPACITY =10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList(){

    }

    public MyList(int capacity){

    }

    public void add(int index, E element){
        ensureCapacity();
        for (int i = size -1; i>=index;i--){
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;

    }

    private void ensureCapacity(int minCapacity){
        if (size>= elements.length){
            Object[] newElements = new Object[size *2 +1];
            System.arraycopy(elements,0,newElements,0,size *2 +1);
            elements = newElements;
        }

    }


}
