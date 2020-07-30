
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println("delta : " + quadraticEquation.getDiscriminant());
        System.out.println("Root1: "+quadraticEquation.getRoot1());
        System.out.println("Root2: "+quadraticEquation.getRoot2());
    }
}
