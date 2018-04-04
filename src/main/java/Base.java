/**
 *@author ksavukov
 * @see Scanner
 */
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        /** @see Scanner */
        Scanner scanner = new Scanner(System.in);

        /** Ввод первого числа с плавающей точкой */
        System.out.println("Введите первое число");
        float f = scanner.nextFloat();

        /** Ввод второго числа с плавающей точкой */
        System.out.println("Введите второе число");
        float fs = scanner.nextFloat();

        /** Выбор операции */
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        System.out.println("5 - Выход");
        int operation = scanner.nextInt();

        /** Вывод оперции */
        if (operation == 1) {
            System.out.printf("%.4f", f + fs);
        } else if (operation == 2) {
            System.out.printf("%.4f", f - fs);
        } else if (operation == 3) {
            System.out.printf("%.4f", f / fs);
        } else if (operation == 4) {
            System.out.printf("%.4f", f * fs);
        }
        else {
            System.exit(0);
        }
    }
}
