import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/**
 * main
 */
public class main {
    static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter number of numbers - n");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        System.out.print("triangular number: ");
        for (int i = 1; i < n + 1; i++) {
            sum = sum + i;
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.print("factorial: " + factor(n) + " ");
    }

}