import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t1.start();
        t2.start();


    }
}
