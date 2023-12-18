package homework_2;
public class Arguments {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // Перебираем аргументы командной строки с помощью цикла for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент № " +i+": args ["+i+"]="+args[i]);
        }
    }
}
