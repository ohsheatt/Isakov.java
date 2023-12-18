package homework_2;

public class harmonic {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("Сумма первых 10 чисел гармонического ряда: %.2f", sum);
    }
    // Вычисление факториала числа с помощью цикла. 
    public static void calculateFactorial() {
        int n = 5;
        int fact = factorial(n);
        System.out.printf("Факториал числа %d равен %d", n, fact);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}