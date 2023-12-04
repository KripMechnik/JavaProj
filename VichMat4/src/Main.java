import java.util.Random;
public class Main {
    public static double f(double x) {
        return Math.sqrt(0.5 * x + 2) / (Math.sqrt(2 * x * x + 1) + 0.8);
    }

    public static double left_rects(double left, double right, int count) {
        double summa = 0.0;
        double step = (right - left) / count;
        double i = left;
        while (i < right) {
            summa += f(i) * step;
            i += step;
        }
        return summa;
    }

    public static double right_rects(double left, double right, int count) {
        double summa = 0.0;
        double step = (right - left) / count;
        double i = left;
        while (i < right) {
            summa += f(i - step) * step;
            i += step;
        }
        return summa;
    }

    public static double middle_rects(double left, double right, int count) {
        double summa = 0.0;
        double step = (right - left) / count;
        double i = left;
        while (i < right) {
            summa += (f(i + step) + f(i)) / 2 * step;
            i += step;
        }
        return summa;
    }

    public static double trap(double left, double right, int count) {
        double summa = 0.0;
        double step = (right - left) / count;
        double i = left;
        while (i < right) {
            summa += (f(i + step) + f(i)) / 2 * step;
            i += step;
        }
        return summa;
    }

    public static double bart_simpson(double left, double right, int count) {
        double step = (right - left) / count / 2;
        double summa = f(left) + f(right);
        double i = left + step;
        while (i < right) {
            summa += 4 * f(i);
            i += 2 * step;
        }
        i = left + 2 * step;
        while (i < right) {
            summa += 2 * f(i);
            i += 2 * step;
        }
        return (right - left) * summa / (6 * count);
    }

    public static double monte_carlo(double left, double right, int count) {
        double height = f(left);
        double sq = (right - left) * height;
        int inside = 0;
        int outside = 0;
        double x;
        double y;
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            x = left + (right - left) * rand.nextDouble();
            y = height * rand.nextDouble();
            if (y > f(x)) {
                outside++;
            } else {
                inside++;
            }
        }
        return sq * (inside) / (inside + outside);
    }

    public static void main(String[] args) {
        System.out.printf("Методом правых прямоугольников: %.2f \n",
                left_rects(0.4, 1.2, 10));

        System.out.printf("Методом левых прямоугольников: %.2f \n",
                right_rects(0.4, 1.2, 10));

        System.out.printf("Методом средних прямоугольников на 15 разбиений: %.2f \n",
                middle_rects(0.4, 1.2, 15));

        System.out.printf("Методом средних прямоугольников на 20 разбиений: %.2f \n",
                middle_rects(0.4, 1.2, 20));

        System.out.printf("Методом трапеций: %.2f \n",
                trap(0.4, 1.2, 10));

        System.out.printf("Методом Симпсона: %.2f \n", bart_simpson(1.2, 2.0, 10));

        System.out.printf("Методом Монте Карло на 20: %.2f \n",
                monte_carlo(0.4, 1.2, 20));

        System.out.printf("Методом Монте Карло на 700: %.2f \n",
                monte_carlo(0.4, 1.2, 700));

        System.out.printf("Методом Монте Карло на 200: %.2f \n",
                monte_carlo(0.4, 1.2, 200));
    }
}