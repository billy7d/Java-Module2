import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList() {

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;

    }

    public E get(int i) {
        return (E) elements[i];
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + " out of bounds ");
        } else {

            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;

            size--;
            return (E) elements[index];
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }

    public E clone() {
        Object[] newElements = new Object[DEFAULT_CAPACITY];
       newElements = elements;
        return (E) newElements;
    }

    public boolean contains(E o) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {

        for (int i = 0; i < elements.length; i++)
            if (elements[i] == o)
                return i;
            return -1;
        }
    public boolean add(E e){
        if (size == DEFAULT_CAPACITY)
            return false;
        else add(size,e);
            return true;
    }






    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
