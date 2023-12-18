package homework_10;
import java.util.Scanner;

public class SEVEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число больше 1: ");
        int n = scanner.nextInt();

        if (n > 1) {
            primeFactorization(n, 2);
        } else {
            System.out.println("Число должно быть больше 1.");
        }
    }

    static void primeFactorization(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactorization(n / divisor, divisor);
        } else {
            primeFactorization(n, divisor + 1);
        }
    }
}

