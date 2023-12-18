package homework_12;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем карты первого и второго игроков
        String firstPlayerCards = scanner.nextLine();
        String secondPlayerCards = scanner.nextLine();

        Queue<Integer> firstPlayerDeck = new LinkedList<>();
        Queue<Integer> secondPlayerDeck = new LinkedList<>();

        // Заполняем колоды игроков картами
        for (int i = 0; i < 5; i++) {
            firstPlayerDeck.add(Integer.parseInt(firstPlayerCards.substring(i, i + 1)));
            secondPlayerDeck.add(Integer.parseInt(secondPlayerCards.substring(i, i + 1)));
        }

        int moves = 0;

        // Игровой цикл
        while (moves < 106 && !firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {
            int firstPlayerCard = firstPlayerDeck.poll();
            int secondPlayerCard = secondPlayerDeck.poll();

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else {
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }

            moves++;

            if (firstPlayerDeck.isEmpty()) {
                System.out.println("second " + moves);
                return;
            } else if (secondPlayerDeck.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }

        System.out.println("botva");
    }
}
