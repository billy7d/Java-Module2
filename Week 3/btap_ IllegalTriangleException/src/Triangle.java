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

        isTriangle(a,b,c);



    }

    public static void isTriangle (double a,double b, double c){
        if (a+b<c){
            throw IllegalTriangleException;
        } else if (a+c<b){
            throw IllegalTriangleException;
        } else if (b+c<a){
            throw IllegalTriangleException;
        }
    }
}
