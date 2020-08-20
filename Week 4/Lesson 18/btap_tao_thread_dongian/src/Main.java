import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new NumberGenerator());
//        Thread t2 = new Thread(new NumberGenerator());
        /*Khi implements Runnable th phải tạo 2 object của class Thread
        với tham số khởi tạo là 2 đối tượng NumberGenerator.*/


        NumberGenerator numberGenerator = new NumberGenerator();

        numberGenerator.setPriority(MAX_PRIORITY);
        numberGenerator.setPriority(MIN_PRIORITY);
        numberGenerator.start();
        numberGenerator.start();


    }
}
