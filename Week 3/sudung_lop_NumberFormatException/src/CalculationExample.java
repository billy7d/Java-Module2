import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y){
        try{
            int tong = x+y;
            int hieu = x-y;
            int tich = x*y;
            int thuong = x/y;
            System.out.println("Tổng x + y = " + tong);
            System.out.println("Hiệu x - y = " + hieu);
            System.out.println("Tích x * y = " + tich);
            System.out.println("Thương x / y = " + thuong);

        } catch (Exception e){
            System.out.println("Ngoai le "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = scanner.nextInt();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();
        CalculationExample  calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
