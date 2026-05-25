import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем два числа
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Наименьшее — начало ряда и шаг
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i += start) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(i * i);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}
