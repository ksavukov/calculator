/**
 *@author ksavukov
 * @see Scanner
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Base {
    public static void main(String[] args)throws Exception {

        /** @see Scanner */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание");
        System.out.println("1-калькулятор");
        System.out.println("2-поиск максимального слова в массиве");
        int task = scanner.nextInt();
        if (task == 1) {
          Base.calc();
        }else if (task == 2){
           Base.massived();
        }
    }
        public static void calc() {
            //Ввод первого числа с плавающей точкой
            Scanner scanner = new Scanner(System.in);
             System.out.println("Введите первое число");
             float f = scanner.nextFloat();

            // Ввод второго числа с плавающей точкой
             System.out.println("Введите второе число");
             float fs = scanner.nextFloat();

            //Выбор операции
             System.out.println("Выберите операцию: ");
             System.out.println("1 - Сложение");
             System.out.println("2 - Вычитание");
             System.out.println("3 - Деление");
             System.out.println("4 - Умножение");
             System.out.println("5 - Выход");
             int operation = scanner.nextInt();

            // Вывод оперции
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

        public static void massived() throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите количество слов: ");
            int size = Integer.parseInt(reader.readLine());
            ArrayList<String> strings = new ArrayList<String>();
            System.out.println("Введите слова: ");
            for (int i = 0; i < size; i++) {
                strings.add(reader.readLine());
            }
            String max = strings.get(0);
            for (int i = 1; i < strings.size(); i++)
            {
                if (strings.get(i).length() > max.length())
                {
                    max = strings.get(i);
                }
            }
            for (int i = 0; i < strings.size(); i++)
            {
                if (max.length() == strings.get(i).length())
                {
                    System.out.println(strings.get(i));
                }
            }
        }

    }

