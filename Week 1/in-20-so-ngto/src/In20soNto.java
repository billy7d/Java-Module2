

public class In20soNto {
    public static void main(String[] args) {


        int numbers = 20;
        int count = 0;
        int n = 2;


        while (count < numbers) {
            if (isPrime(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } return true;
    }
}




