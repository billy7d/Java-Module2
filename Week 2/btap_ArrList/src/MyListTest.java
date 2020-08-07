public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList(10);
        myList.add(0,0);
        myList.add(1,1);
        myList.add(2,2);
        myList.add(3,3);

        myList.remove(2);

//        System.out.println(myList.contains(1));

        System.out.println(myList.toString());

        System.out.println(myList.clone().toString());

    }
}
