import java.util.Scanner;

public class TemperatureConversion {
    public static double FahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();

        double Celsius = (5.0 / 9) * (Fahrenheit - 32);

        return Celsius;
    }

    public static double CelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        double Celsius = sc.nextDouble();

        double Fahrenheit = Celsius * 9 / 5.0 + 32;

        return Fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num !=0 ) {
            System.out.println("MENU");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Celsius: " + FahrenheitToCelsius());
                    break;
                case 2:
                    System.out.println("Fahrenheit: " + CelsiusToFahrenheit());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not found");
                    break;
            }
        }
    }
}
