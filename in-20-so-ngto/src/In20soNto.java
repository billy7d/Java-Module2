

public class In20soNto {
    public static void main(String[] args) {


        int numb = 20;
        int count = 0;
        int n = 2;
        int number =2;
        boolean check = true;

        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    continue;
                }
                check = true;
                i++;
            }
        }
        while (count < numb) {
            if (check) {
                count++;
                System.out.println(number);

            }number ++;
        }
    }
}
