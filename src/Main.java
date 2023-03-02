import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printInfoLeapYear(2023);
        printInfoOsMadeYear(0, 2024 );
    }

    public static void printInfoLeapYear(int year) {

        System.out.println("Задача 1");

        if (isLeapYear(year)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printInfoOsMadeYear(int clientOS, int deviceYear) {

        System.out.println("Задача 2");

        if (clientOS != 0 & clientOS != 1) {
            System.out.println("ОС должна иметь значение 0 или 1");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        String result = "Нужно установить " + (deviceYear < currentYear ? " облегченную версию для " : " версию для ") + (clientOS == 0 ? "iOS" : "Android");
        System.out.println(result);
    }
}