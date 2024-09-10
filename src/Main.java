//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Task6(12);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


    /**
     * Задание 1: Напишите функцию, которая принимает два числа и возвращает максимальное из них.
     * Если числа равны, выбрасывайте исключение с сообщением об ошибке.
     *
     * @return Максимальное число
     */
    static int Task1(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны, невозможно определить макс");
        }
        return Math.max(a, b);
    }


    /**
     * Задание 2: Создайте функцию для деления двух чисел.
     * Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости
     * деления на ноль
     *
     * @return Результат деления
     */
    static double Task2(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return numerator / denominator;
    }


    /**
     * Задание 3: Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
     * Если строка не может быть конвертирована, выбрасывайте NumberFormatException
     *
     */
    static int Task3(String str) throws NumberFormatException{
        return Integer.parseInt(str);
    }


    /**
     * Задание 4: Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException,
     * если возраст меньше нуля или больше 150.
     */
    static void Task4(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст выходит за границы");
        }
    }


    /**
     * Задание 5: Реализуйте функцию, которая находит корень из числа.
     * Если число отрицательное, выбрасывайте IllegalArgumentException
     *
     */
    static double Task5(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }


    /**
     * Задание 6: Напишите функцию, которая вычисляет факториал числа.
     * Если число отрицательное, выбрасывайте исключение.
     *
     */
    static int Task6(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }


    /**
     * Задание 7: Cоздайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение
     */
    static void Task7(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули");
            }
        }
    }


    /**
     * Задание 8: Реализуйте функцию, которая возводит число в степень.
     * Если степень отрицательная, выбрасывайте исключение
     */
    static double Task8(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(base, exponent);
    }


    /**
     * Задание 9: Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов.
     * Если число символов больше длины строки, выбрасывайте исключение.
     *
     */
    static String Task9(String input, int length) {
        if (length > input.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return input.substring(0, length);

    }


    /**
     * Задание 10: Напишите функцию, которая ищет элемент в массиве.
     * Если элемент не найден, выбрасывайте исключение с сообщением об ошибке
     */
    static int Task10(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Возвращает индекс найденного элемента
            }
        }
        throw new IllegalArgumentException("Элемент " + target + " не найден в массиве");

    }


    /**
     * Задание 11:
     */
    static void Task11() {}


    /**
     * Задание 12:
     */
    static void Task12() {}


    /**
     * Задание 13:
     */
    static void Task13() {}


    /**
     * Задание 14:
     */
    static void Task14() {}


    /**
     * Задание 15:
     */
    static void Task15() {}


    /**
     * Задание 16:
     */
    static void Task16() {}


    /**
     * Задание 17:
     */
    static void Task17() {}


    /**
     * Задание 18:
     */
    static void Task18() {}


    /**
     * Задание 19:
     */
    static void Task19() {}


    /**
     * Задание 20:
     */
    static void Task20() {}

}