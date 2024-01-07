public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int clientOS = 1; //(0 — iOS, 1 — Android)

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Нет такой OS");
        }


        System.out.println("Задача 2");

        int yourOS = 1;              ////(0 — iOS, 1 — Android)
        int clientDeviceYear = 2014;

        if (yourOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (yourOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (yourOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (yourOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println("Задача 3");

        int year = 2400;

        if ((year % 4 == 0 && year % 100 != 0 && year >= 1584) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        System.out.println("Задача 4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }


        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас на календаре зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас на календаре весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас на календаре лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас на календаре осень.");
                break;
            default:
                System.out.println("Нет такого месяца в году!");
        }


    }
}