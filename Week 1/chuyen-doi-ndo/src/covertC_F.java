import java.util.Scanner;

public class covertC_F {
    public static void main(String[] args) {
        double celcius;
        double fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();



        switch (choice){
            case 1:
                System.out.println("Input fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Input celcius: ");
                celcius = scanner.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celcius));
                break;
            case 0:
                System.exit(0);


        }

        } while (choice != 0);

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius + 32;
        return fahrenheit;

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;

    }


}
