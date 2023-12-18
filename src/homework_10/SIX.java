package homework_10;
import java.util.Scanner;

public class SIX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число больше 1: ");
        int n = scanner.nextInt();

        if (n > 1 && isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Метод для проверки числа на простоту с помощью проверки делителей
    static boolean isPrime(int n, int divisor) {
        // Базовый случай: если делитель стал больше или равен квадратному корню из n, то число простое
        if (divisor * divisor > n) {
            return true;
        }

        // Если число делится на divisor без остатка, то оно составное
        if (n % divisor == 0) {
            return false;
        }

        // Рекурсивный случай: увеличиваем делитель и продолжаем проверку
        return isPrime(n, divisor + 1);
    }
}
