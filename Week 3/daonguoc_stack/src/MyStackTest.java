import java.util.ArrayList;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();

        list.add(0,0);
        list.add(1,1);
        list.add(2,2);
        list.add(3,3);
        list.add(4,4);

        System.out.println(list.toString());
        System.out.println(list.size());
        list.swap();
        System.out.println(list.toString());







    }


}
