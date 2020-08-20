class Node<E> {
    E element; Node<E> next;
    public Node(E e) {
        element = e;
    }

    public E removeLast() {
        if (size == 0) return null; // Nothing to remove
        else if (size == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            size = 0;
            return temp.element;
        } else {
            Node current = head;

            for (int i = 0; i < size - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
}
