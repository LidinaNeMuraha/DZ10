public class Main {

    // метод 1 задача

    public static int checkYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        return year;
    }

    // метод 2 задание

    public static void systemYear (int clientOS, int clientDeviceYear ) {
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015 ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }
        }

    }

    // метод 3 задание

    public static void calculationofthedeliverytime(int time, int deliveryDistance){
        if (deliveryDistance < 20) {
            System.out.println("Потребуеться дней " + time);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            time = time++;
            System.out.println("Потребуеться дней " + time);
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            time = time++;
            System.out.println("Потребуеться дней " + time);
        }
        else {
            System.out.println("Доставка невозможна");
        }
    }

    public static void main(String[] args) {

        // zadanie 1
        int leapYear = 2021;
        checkYear(leapYear);

        //zadanie 2
        int clientOS = 0;
        int clientDeviceYear = 2024;
        systemYear(clientOS, clientDeviceYear);

        // zadanie 3
        int deliveryDistance = 95;
        int time = 1;
        calculationofthedeliverytime(deliveryDistance , time);





    }
}