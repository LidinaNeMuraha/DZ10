public class Main {

    public static int checkYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        return year;
    }


    public static void main(String[] args) {

        // zadanie 1
        int leapYear = 2021;
        checkYear(leapYear);



    }
}