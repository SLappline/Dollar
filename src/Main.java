import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        //Пользователь вводит текущий курс и количество рублей.
        //Итоговое значение должно быть округлено до двух знаков после запятой.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double dollar = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = scanner.nextDouble();
        double sum = rub/dollar;
        System.out.printf("Итого: " + "%.2f",sum);
        System.out.print(" долларов");
        //Пример для теста работы программы:
        //- Курс доллара: 67,55
        //        - Количество рублей: 1000
        //        - Итого: 14,80 долларов

    }
}