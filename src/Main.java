import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printInfoLeapYear(2023);
        printInfoOsMadeYear(0, 2024 );
        printInfoDeliveryDistance(-101);
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

    public static int calculateDeliveryDistance(int deliveryDistance) {
        System.out.println("Задача 3");

        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return -1;
        }
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void printInfoDeliveryDistance(int deliveryDistance) {
        int deliveryDays = calculateDeliveryDistance(deliveryDistance);
        if (deliveryDays != -1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка карты осуществляется на растоянии 100 км.");
        }
    }
}