package bTap;

public class MyDate {
    private static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    private static final int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : dayInMonths[month - 1];
        if (day < 1 || day > maxDay) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (dayOfWeek + 5) % 7;
    }


    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date: " + year + "-" + month + "-" + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", strDays[(dayOfWeek + 1) % 7], day, strMonths[month - 1], year);
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month == 12) {
            setDate(year + 1, 1, 1);
        } else {
            setDate(year, month + 1, 1);
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            setDate(year + 1, 1, Math.min(day, 31));
        } else {
            int maxDay = (month == 1 && isLeapYear(year)) ? 29 : dayInMonths[month];
            setDate(year, month + 1, Math.min(day, maxDay));
        }
        return this;
    }

    public MyDate nextYear() {
        if (month == 2 && day == 29 && !isLeapYear(year + 1)) {
            setDate(year + 1, 2, 28);
        } else {
            setDate(year + 1, month, day);
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = (month == 2 && isLeapYear(year)) ? 29 : dayInMonths[month - 1];
        } else {
            year--;
            month = 12;
            day = 31;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            int maxDay = (month == 3 && isLeapYear(year)) ? 29 : dayInMonths[month - 2];
            setDate(year, month - 1, Math.min(day, maxDay));
        } else {
            setDate(year - 1, 12, Math.min(day, 31));
        }
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29 && !isLeapYear(year - 1)) {
            setDate(year - 1, 2, 28);
        } else {
            setDate(year - 1, month, day);
        }
        return this;
    }
}