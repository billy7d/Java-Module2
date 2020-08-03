import java.util.Scanner;

public class BmiCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;

        System.out.print("Nhap can nang(kg): ");
        weight = scanner.nextDouble();

        System.out.print("Nhap chieu cao(m): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        }else if (bmi >= 25.0 && bmi <30){
            System.out.println("Overweight");
        } else if (bmi >=30){
            System.out.println("Obese");
        }
    }
}
