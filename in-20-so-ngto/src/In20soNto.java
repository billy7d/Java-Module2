

public class In20soNto {
    public static void main(String[] args) {


        int numbers = 20;
        int count = 0;
        int n = 2;

        boolean check = true;

        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                check = true;
                i++;
                n++;
            }
        }
        while (count < numbers) {
            if (check) {
                count++;
                System.out.println(n);

            }
        }
    }
}
