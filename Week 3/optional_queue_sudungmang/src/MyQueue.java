import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == capacity)
            return true;
        else return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0)
            return true;
        else return false;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("queue is full");
        } else {
            if (tail == capacity - 1) {
                tail = 0;
            }
            tail++;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "capacity=" + capacity +
                ", queueArr=" + Arrays.toString(queueArr) +
                ", head=" + head +
                ", tail=" + tail +
                ", currentSize=" + currentSize +
                '}';
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("queue is empty");
        } else {
            if (head == capacity - 1) {
                System.out.println("done, removed: " + queueArr[capacity - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }

    }
}
