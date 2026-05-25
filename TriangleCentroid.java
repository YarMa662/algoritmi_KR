import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriangleCentroid {
    public static void main(String[] args) {
        // Пример входной строки
        String input = "([4, 6], [12, 4], [10, 10])";

        // Парсинг координат из строки
        double[][] points = parseInput(input);

        // Вычисление барицентра
        double cx = (points[0][0] + points[1][0] + points[2][0]) / 3.0;
        double cy = (points[0][1] + points[1][1] + points[2][1]) / 3.0;

        // Форматированный вывод
        System.out.printf("{%.4f, %.4f}%n", cx, cy);
    }

    private static double[][] parseInput(String input) {
        double[][] points = new double[3][2];
        Pattern pattern = Pattern.compile("\[(\d+(?:\.\d+)?),\s*(\d+(?:\.\d+)?)\]");
        Matcher matcher = pattern.matcher(input);

        int i = 0;
        while (matcher.find() && i < 3) {
            points[i][0] = Double.parseDouble(matcher.group(1));
            points[i][1] = Double.parseDouble(matcher.group(2));
            i++;
        }
        return points;
    }
}
