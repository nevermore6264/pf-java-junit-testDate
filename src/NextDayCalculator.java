public class NextDayCalculator {
    public static String testDay(int day, int month, int year) {
        day++;
        return day + "/" + month + "/" + year;
    }

    public static String testMonth(int day, int month, int year) {
        if (month == 01 || month == 03 || month == 05 || month == 07 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                day = 01;
                month++;
            } else day++;
        } else if (month == 2) {
            if (checkYear(year)) {
                if (day == 29) {
                    day = 01;
                    month++;
                } else day++;
            } else {
                if (day == 28) {
                    day = 01;
                    month++;
                } else day++;
            }
        } else if (month == 04 || month == 06 || month == 9 || month == 11) {
            if (day == 30) {
                day = 01;
                month++;
            } else {
                day++;
            }
        } else {
            if (day == 30) {
                day = 01;
                month++;
            } else day++;
        }
        return day + "/" + month + "/" + year;
    }

    public static boolean checkYear(int year) {
        boolean result;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) result = true;
        else result = false;
        return result;
    }
}