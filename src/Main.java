public class Main {
    public static void main(String[] args) {
        printInfoLeapYear(2023);
    }

    public static void printInfoLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}