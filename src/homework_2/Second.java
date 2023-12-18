package homework_2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int i = 0;

        // Используем цикл do-while для вычисления суммы элементов
        do {
            sum += arr[i];
            i++;
        } while (i < n);

        // Используем цикл while для поиска максимального и минимального элементов
        i = 0;
        while (i < n) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}