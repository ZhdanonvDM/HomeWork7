import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача № 1");
        checkYear(2006);
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача № 2");
        checkYearAndOS(1,2020);
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача № 3");
        checkDelivery (40);
        System.out.println();
    }
    public static void checkYear (int year) {
        System.out.print(year + " год - ");
        if (year % 4 != 0){
            System.out.println("невисокосный");}
        else if (year % 400 == 0) {
            System.out.println("високосный");
        }
        else if (year % 100 == 0) {
            System.out.println("невисокосный");
        }
        else {
            System.out.println("високосный");
        }
    }
    public static void checkYearAndOS (int clientOS, int clientDeviceYear) {
        if (clientDeviceYear>2015) {
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

    public static void checkDelivery (int deliveryDistance) {
        System.out.print("Потребуется дней: ");
        if (deliveryDistance<20){
            System.out.println("1");}
        else if (deliveryDistance<60 && deliveryDistance>20) {
            System.out.println("2");
        }
        else if (deliveryDistance<100 && deliveryDistance>60) {
            System.out.println("3");
        }
        else {
            System.out.println("доставка не осуществляется");
        }
    }
}