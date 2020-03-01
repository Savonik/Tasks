package jc01_2020.Savonik.lesson08.task03;

public class Date {
    private int day;
    private int month;
    private int year;
    private int getDayOfYear;
    boolean leapYear;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        leapYear = new Year().leapYear();
        getDayOfYear = new Year().getDayOfYear();
        System.out.println("Заданная дата: " + day + "." + month + "." + year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static DayOfWeek valueOf(int index) {
        DayOfWeek Day = null;
        for (DayOfWeek s : DayOfWeek.values()) {
            if (s.getNumber() == index) {
                Day = s;
            }
        }
        return Day;
    }

    public DayOfWeek getDayOfWeek() {
        int k = year - (14 - month) / 12;
        int n = (day + 31 * (month + 12 * ((14 - month) / 12) - 2) / 12 + k + k / 4 - k / 100 + k / 400) % 7;
        return valueOf(n);
    }


    public boolean leapYear() {
        return leapYear;
    }

    public int getDayOfYear() {
        return getDayOfYear;
    }

    public static int daysBetween(Date startDate, Date endDate) {
        int daysBetween = endDate.getDay() + 1 - startDate.getDay();

        for (int i = startDate.year; i <= endDate.getYear(); i++) {
            startDate.setYear(i);
            daysBetween += startDate.leapYear() ? 366 : 365;
        }
        for (int i = 1; i < startDate.getMonth(); i++) {
            startDate.setMonth(i);
            daysBetween -= startDate.getDays();
        }
        for (int i = endDate.getMonth(); i <= 12; i++) {
            endDate.setMonth(i);
            daysBetween -= endDate.getDays();
        }
        return daysBetween;

    }

    class Year {
        public boolean leapYear() {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }

        private int getDayOfYear() {
            if (!leapYear()) {
                return 365;
            } else {
                return 366;
            }
        }

    }

    static class Month {
        public int getDays(int monthNumber, boolean leapYear) {
            if (monthNumber == 2) {
                return leapYear ? 28 : 29;
            } else if (monthNumber <= 7) {
                return monthNumber % 2 == 1 ? 31 : 30;
            } else return monthNumber % 2 == 1 ? 30 : 31;
        }
    }

    static class Day {
    }

    public int getDays() {
        if (month == 2) {
            return leapYear ? 28 : 29;
        } else if (month <= 7) {
            return month % 2 == 1 ? 31 : 30;
        } else return month % 2 == 1 ? 30 : 31;
    }
}
