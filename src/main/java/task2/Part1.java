package task2;

public class Part1 {

    public static void compareInt(int a, int b) {
        if (a > b) {
            System.out.println("Число " + a + " больше " + b);
        } else if (a < b) {
            System.out.println("Число " + a + " меньше " + b);
        } else if (a == b) {
            System.out.println("Числа равны");
        }
    }

    public static void plusInt(int a, int b) {
        System.out.println("Сумма чисел " + a + " и " + b + " = " + (a + b));
    }

    public static void minusInt(int a, int b) {
        System.out.println("Разница чисел " + a + " и " + b + " = " + (a - b));
    }

    public static void timesInt(int a, int b) {
        System.out.println("Произведение чисел " + a + " и " + b + " = " + (a * b));
    }

    public static void devidedByInt(double a, double b) {
        System.out.println("Деление числа " + a + " на число " + b + " = " + (a / b));
    }
}
