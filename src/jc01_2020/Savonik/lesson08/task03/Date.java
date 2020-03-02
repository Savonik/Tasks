package jc01_2020.Savonik.lesson08.task03;

public class Date {
    public int day, month, year, getDayOfYear ;
    public boolean leapYear;

    public Date(int day, int month, int year) {
        this.day = day;  this.month = month; this.year = year;
        leapYear = new Year().leapYear();
        getDayOfYear = new Year().getDayOfYear();
        System.out.println("Заданная дата: " + day + "." + month + "." + year);
    }

    public int getDay() { return day; }
    public int getMonth() { return month;}
    public int getYear() { return year; }

    public static DayOfWeek valueOf(int index) {
        DayOfWeek Day = null;
        for (DayOfWeek s : DayOfWeek.values()) if (s.getNumber() == index) Day = s;
        return Day;
    }

    public DayOfWeek getDayOfWeek() {
        int k = year - (14 - month) / 12;
        int n = (day + 31 * (month + 12 * ((14 - month) / 12) - 2) / 12 + k + k / 4 - k / 100 + k / 400) % 7;
        return valueOf(n);
    }

    public boolean leapYear() { return leapYear; }
    public int getDayOfYear() { return getDayOfYear; }

    public static int daysBetween(Date startDate, Date endDate) {
        int daysBetween = endDate.getDay() - startDate.getDay();
        for (int i = startDate.getYear(); i <= endDate.getYear(); i++) daysBetween = daysBetween + Date.getDayOfYear(i);
        for (int i = 1; i < startDate.getMonth(); i++) daysBetween -= getDays(i);
        for (int i = endDate.getMonth(); i <= 12; i++) daysBetween -= getDays(i);
        return daysBetween;
    }

    private class Year {
        public boolean leapYear() {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }

        public int getDayOfYear() { return leapYear()? 366:365; }
    }

    static class Month {
        public int getDays(int monthNumber, boolean leapYear) {
            if (monthNumber == 2) return leapYear ? 29 : 28;
            if (monthNumber <= 7) {
                return monthNumber % 2 == 1 ? 31 : 30;
            } else return monthNumber % 2 == 1 ? 30 : 31;
        }
    }

    static class Day { }
    
    static boolean leapYear(int i) { return ((i % 4 == 0) && (i % 100 != 0)) || (i% 400 == 0); }
    public static int getDayOfYear(int i){
        return leapYear(i)? 366: 365;
    }
    public static int getDays(int i) {
        if (i == 2) { return leapYear(i) ? 29 : 28; }
        else if (i <= 7) { return (i % 2 == 1 ? 31 : 30); }
        else return (i % 2 == 1 ? 30 : 31);
    }
}
