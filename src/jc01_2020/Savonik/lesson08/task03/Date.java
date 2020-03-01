package jc01_2020.Savonik.lesson08.task03;

public class Date {
    public int day;
    public int month;
    public int year;
    public static int getDayOfYear;
    public static boolean leapYear;

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

    public void setMonth(int month) {
        this.month = month;
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
      
        int daysBetween = endDate.getDay() - startDate.getDay();
        int month1 = startDate.getMonth();
        Date.Year date1 = new Year();
        for (int i = startDate.getYear(); i <= endDate.getYear(); i++) {
            date1.setYear(i);
            daysBetween += date1.getDayOfYear();
        }
        for (int i = 1; i < month1; i++) {
            daysBetween -= startDate.getDays();
        }
        for (int i = endDate.getMonth(); i <= 12; i++) {
            endDate.setMonth(i);
            daysBetween -= endDate.getDays();
        }
        return daysBetween;
       }
       
        private static class Year {
            private int year;
            public void setYear(int year) {
                this.year = year;
            }
        
        public boolean leapYear() {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }

        private int getDayOfYear() {
            if (leapYear()) {
                return 366;
            } else {
                return 365;
            }
        }

    }

    static class Month {
        public int getDays(int monthNumber, boolean leapYear) {
            if (monthNumber == 2) {
                return leapYear ? 29 : 28;
            } else if (monthNumber <= 7) {
                return monthNumber % 2 == 1 ? 31 : 30;
            } else return monthNumber % 2 == 1 ? 30 : 31;
        }
    }

    static class Day {
    }

    public int getDays() {
        if (month == 2) {
            return (leapYear ? 29 : 28);
        } else if (month <= 7) {
            return (month % 2 == 1 ? 31 : 30);
        } else return (month % 2 == 1 ? 30 : 31);
    }
    

}
