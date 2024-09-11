import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            Task20(null);
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
     * Задание 11: Создайте функцию, которая конвертирует целое число в двоичную строку.
     * Если число отрицательное, выбрасывайте исключение
     */
    static String Task11(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательно число");
        }
        return Integer.toBinaryString(number);
    }


    /**
     * Задание 12: Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
     * Если второе число равно нулю, выбрасывайте ArithmeticException
     *
     */
    static boolean Task12(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a % b == 0;
    }


    /**
     * Задание 13: Напишите функцию, которая возвращает элемент списка по индексу.
     * Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException
     */
    static <T> T Task13(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка");
        }
        return list.get(index);
    }


    /**
     * Задание 14: Создайте функцию для проверки сложности пароля.
     * Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException
     */
    static void Task14(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком слабый. Должен содержать не менее 8 символов");
        }
    }


    /**
     * Задание 15: Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
     * Если формат неверен, выбрасывайте DateTimeParseException
     */
    static void Task15(String dateStr) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
    }


    /**
     * Задание 16: Реализуйте функцию, которая объединяет две строки.
     * Если одна из строк равна null, выбрасывайте NullPointerException
     *
     */
    static String Task16(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк null");
        }
        return str1 + str2;
    }


    /**
     * Задание 17: Создайте функцию, которая возвращает остаток от деления двух чисел.
     * Если второе число равно нулю, выбрасывайте исключение
     *
     */
    static int Task17(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return dividend % divisor;
    }


    /**
     * Задание 18: Реализуйте функцию, которая находит квадратный корень числа.
     * Если число отрицательное, выбрасывайте исключение
     *
     */
    static double Task18(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень");
        }
        return Math.sqrt(number);
    }


    /**
     * Задание 19: Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
     * Если температура меньше абсолютного нуля, выбрасывайте исключение
     *
     */
    static double Task19(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля");
        }
        return (celsius * 9/5) + 32;
    }


    /**
     * Задание 20: Создайте функцию, которая проверяет, является ли строка пустой или null.
     * Если строка пустая или равна null, выбрасывайте исключение
     */
    static void Task20(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равной null");
        }

    }

}