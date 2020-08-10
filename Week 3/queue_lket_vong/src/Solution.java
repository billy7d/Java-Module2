public class Solution {

    public static class Node{
        public int data;
        public Node link;
    }

    public static class Queue{
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue queue,int value){
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null){
            queue.front = temp;
        } else {
            queue.rear.link =temp;
            queue.rear = temp;
            queue.rear.link = queue.front;

        }
    }

    public static void deQueue(Queue queue){
        if (queue.front== null) {
            System.out.println("Queue is empty");
        }
        if (queue.front == queue.rear){
            queue.front = queue.rear = null;
        }
        else {
            Node del = queue.front;

        }

    }

    public static void displayQueue(){

    }
}
