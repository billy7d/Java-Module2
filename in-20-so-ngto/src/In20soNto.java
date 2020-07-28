

public class In20soNto {
    public static void main(String[] args) {


        int numbers = 20;
        int count = 0;
        int n = 2;



        public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    return false;

                }

                i++;
                n++;
            }
        }
        }
        while (count < numbers) {
            if (isPrime(n) == true) {
                count++;
                System.out.println(n);

            }
            n++;
        }

    }
}