package homework_7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator {
    private JFrame frame;
    private JButton milanButton;
    private JButton madridButton;
    private JButton endMatchButton; // Новая кнопка для завершения матча
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel; // Метка для отображения победителя

    private int milanScore = 0;
    private int madridScore = 0;
    private boolean matchEnded = false; // Флаг, указывающий, завершился ли матч

    public FootballMatchSimulator() {
        frame = new JFrame("Football Match Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        endMatchButton = new JButton("Завершить матч"); // Новая кнопка
        resultLabel = new JLabel("Счет: 0 X 0");
        lastScorerLabel = new JLabel("Последний гол забили: N/A");
        winnerLabel = new JLabel("");

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!matchEnded) {
                    milanScore++;
                    updateResultLabel();
                    lastScorerLabel.setText("Последний гол забили: AC Milan");
                }
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!matchEnded) {
                    madridScore++;
                    updateResultLabel();
                    lastScorerLabel.setText("Последний гол забили: Real Madrid");
                }
            }
        });

        endMatchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                matchEnded = true;
                determineWinner();
                endMatchButton.setEnabled(false); // Отключаем кнопку после завершения матча
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(endMatchButton);
        panel.add(resultLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(lastScorerLabel, BorderLayout.SOUTH);
        frame.add(winnerLabel, BorderLayout.NORTH);

        frame.setVisible(true);
    }

    private void updateResultLabel() {
        resultLabel.setText("Счет: " + milanScore + " X " + madridScore);
    }

    private void determineWinner() {
        String winner;
        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "Ничья!";
        }
        winnerLabel.setText("Победитель: " + winner);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FootballMatchSimulator();
            }
        });
    }
}