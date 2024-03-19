public class Main {

    public static int checkYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        return year;
    }

    public static int systemYear () {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015 ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                return clientDeviceYear;
            }

        }
        return clientOS;
    }

    public static void main(String[] args) {

        // zadanie 1
        int leapYear = 2021;
        checkYear(leapYear);

        //zadanie 2
        systemYear();







    }
}