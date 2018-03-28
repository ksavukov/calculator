/**
 *@author ksavukov
 * @see Scanner
 */
import java.util.Scanner;

public class Base {
    public static void main(String[] args){

        /** @see Scanner */
        Scanner scanner = new Scanner(System.in);

        /** Ввод первого числа с плавающей точкой */
        float f = scanner.nextFloat();

        /** Ввод второго числа с плавающей точкой */
        float fs = scanner.nextFloat();

        /** Вычисление суммы двух чисел */
        float sum = fs+f;

        /** Вывод суммы */
        System.out.printf("%.4f", sum);
    }
}
