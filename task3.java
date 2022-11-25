import java.util.Scanner;

// Реализовать простой калькулятор
public class task3 {
    static float sum(float a, float b) {
        return a + b;
    }

    static float dif(float a, float b) {
        return a - b;
    }

    static float multi(float a, float b) {
        return a * b;
    }

    static float div(float a, float b) {
        return a / b;

    }

    public static void main(String[] args) {
        int repeat = 1;
        Scanner iScanner = new Scanner(System.in);
        float a = 0;
        float b = 0;
        int action = 0;
        while (repeat == 1) {
            System.out.print("Enter the first numbers \n");

            a = iScanner.nextFloat();
            System.out.print("Enter the first numbers \n");
            b = iScanner.nextFloat();
            System.out.println("Select an action");
            System.out.println("1 - summa");
            System.out.println("2 - difference");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            action = iScanner.nextInt();

            switch (action) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f \n ", a, b, sum(a, b));
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f \n ", a, b, dif(a, b));
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f \n ", a, b, multi(a, b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.printf("%.2f / %.2f = %.2f \n ", a, b, div(a, b));
                    } else {
                        System.out.println("Error - division by zero");
                    }
                    break;
                default:
                    System.out.println("Error - not action");
                    break;
            }
            System.out.println("Want to repeat, Yes - 1, No - 0");
            repeat = iScanner.nextInt();

        }
        iScanner.close();
    }

}
