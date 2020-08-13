
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap canh b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap canh c: ");
        double c = scanner.nextDouble();

        try {
            IllegalTriangleException(a, b, c);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void IllegalTriangleException(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
//            System.out.println(" 3 canh khong duoc nho hon 0");
            throw new Exception();
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception();


        }

    }
}
