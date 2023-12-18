package homework_2;

public class Main {
    public static void main(String[] args)
    {
        int[] num = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int snu = 0;
        double SA = 0;
        for (int i = 0; i < num.length; i ++) {
            snu = snu + num[i];
        }
        SA = (double) snu / num.length;

        System.out.println("Сумма элементов массива: " + snu);
        System.out.println("Среднее арифметическое: " + SA);
    }
}

