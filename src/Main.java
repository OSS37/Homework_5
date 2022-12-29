public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        char clientOS = '0';
        switch (clientOS) {
            case '0':
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;

            case '1':
            System.out.println("Установите версию приложения для Android по ссылке");
            break;
        }

        System.out.println("Задача 2");
        char clientOSS = '1';
        int clientDeviceYear = 2015;
        if (clientOSS == '0' && clientDeviceYear<=2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
            else if (clientOSS == '0' && clientDeviceYear>2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientOSS == '1' && clientDeviceYear<=2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else if (clientOSS == '1' && clientDeviceYear>2015) {
                 System.out.println("Установите версию приложения для Android по ссылке");
                }

        System.out.println("Задача 3");
            int year=2361;
            if ((year%4)==0 && (year%100!=0)) {
                System.out.println(year + " год является високосным");
            }
            else if ((year%400)==0) {
                 System.out.println(year + " год является високосным");
            }
            else {
                System.out.println(year + " год не является високосным");
            }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance<=20) {
            System.out.println("Для доставки потребуется один день");
        }
            else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Для доставки потребуется два дня");
        }
                else if (deliveryDistance>60 && deliveryDistance<=100) {
                 System.out.println("Для доставки потребуется три дня");
        }
                else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зимний месяц");
            break;
            case 2:
                System.out.println("Февраль - зимний месяц");
            break;
            case 3:
                System.out.println("Март - весенний месяц");
            break;
            case 4:
                System.out.println("Апрель - весенний месяц");
            break;
            case 5:
                System.out.println("Май - весенний месяц");
            break;
            case 6:
                System.out.println("Июнь - летний месяц");
            break;
            case 7:
                System.out.println("Июль - летний месяц");
            break;
            case 8:
                System.out.println("Август - летний месяц");
            break;
            case 9:
                System.out.println("Сентябрь - осенний месяц");
            break;
            case 10:
                System.out.println("Октябрь - осенний месяц");
            break;
            case 11:
                System.out.println("Ноябрь - осенний месяц");
            break;
            case 12:
                System.out.println("Декабрь - зимний месяц");
            break;
            default:
                System.out.println("Такого месяца не существует");

        }
        }
        }

