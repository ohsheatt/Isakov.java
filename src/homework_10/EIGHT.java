package homework_10;

import java.util.Scanner;

public class EIGHT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase(); // Приводим к нижнему регистру для учета регистра

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true; // Однобуквенное слово или пустая строка - палиндром
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            // Первая и последняя буквы совпадают, рекурсивно проверяем внутреннюю часть
            return isPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false; // Буквы не совпадают, это не палиндром
        }
    }
}
