import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mau sac cua tam giac: ");
        String color = scanner.nextLine();

        System.out.print("Nhap do dai canh a: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhap do dai canh b: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhap do dai canh c: ");
        double side3 = scanner.nextDouble();




        Triangle triangle = new Triangle(side1,side2,side3,color);

        System.out.println(triangle.toString());
    }
}
