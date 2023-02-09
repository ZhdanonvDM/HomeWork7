import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача № 1
        int year = 2020;
        if (checkYear(year)){
            System.out.println("Год " + year + " високосный");
        } else System.out.println("Год " + year + " невисокосный");

        // Задача № 2
        checkYearAndOS(1, 2020);

        // Задача № 3
        int days = checkDelivery (60);
        if (days > 0) {
            System.out.println("Доставка займет " + days + " день(ня)");
        }
    }
    public static boolean checkYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
    public static void checkYearAndOS (int clientOS, int clientDeviceYear) {
        if (clientDeviceYear<2015) {
            if (clientOS == 0) {
                System.out.println("установите iOS");
            } else System.out.println("установите Android");
        }
        else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int checkDelivery (int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1;
        }
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}
