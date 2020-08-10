public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();
        MyStack<Integer> list2 = new MyStack<>();

        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Before swap: ");
        System.out.println(list);
        System.out.println(list.size());

        list.reverse();

        System.out.println("After swap: ");
        System.out.println(list);


        MyStack<String> list3 = new MyStack<>();
        list3.push("Hung");
        list3.push("dep");
        list3.push("zai");
        MyStack<String> list4 = new MyStack<>();


        list3.reverse();
        System.out.println(list3);




    }


}
