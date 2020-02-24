package jc01_2020.Savonik.lesson08.task03;

/*
 * Создать объект своего класса Date (не java.util или java.sql), используя вложенные классы Год, Месяц, День.
 * Методы: задать дату, вывести на консоль день недели по заданной дате. День недели представить в виде перечисления (enum).
 * Рассчитать количество дней, в заданном временном промежутке.
 *
 * public Date(int day, int month, int year)
 * public DayOfWeek getDayOfWeek()
 * public int getDayOfYear()
 * public int daysBetween(Date startDate, Date endDate)
 *
 * В классе Year должна осуществляться проверка на високостность. Установить это значение для соотв. атрибута года.
 * В классе Month можно сделать метод который позволит узнать количество дней для того или иного месяца [1-12].
 * Метод можно использовать для подсчета дней в других методах.
 *
 * public int getDays(int monthNumber, boolean leapYear)
 *
 * Перечисление должно иметь конструктор с параметром, для того чтобы задать индексы дней недели [0-6]. 0 – Понедельник.
 *
 * Так же можно создать статический метод
 * public static DayOfWeek valueOf (int index)
 * Для того чтобы можно было после математических расчетов использовать данный метод для преобразования индекса дня недели
 * в соотв. элемент перечисления.
 *
 * При желании можно сделать собственную архитектуру для решения поставленной задачи. Главное продемонстрировать в решении
 * использование вложенных классов и перечисления.
 *
 */


public class Application {
    
    public static class Date {
        private  static int day, month, year,n,k,m;
        boolean leapYear;

        public Date(int day, int month, int year){
            this.day=day;
            this.month=month;
            this.year=year;
            leapYear = new Year().leapYear();
            System.out.println("Заданная дата: "+day+"."+month+"."+year);
        }

        public DayOfWeek getDayOfWeek() {
            DayOfWeek Day = null;
            k = year - (14 - month) / 12;
            m = month + 12 * ((14 - month) / 12) - 2;
            n = ((day + (31 * m) / 12 + k + k / 4 - k / 100 + k / 400) % 7);
            for (DayOfWeek s: DayOfWeek.values()) {
                if (s.getNumber() == n){ Day = s; }
            }
            return Day;
        }

        public int daysBetween(Date startDate, Date endDate){
            
            
            return 1;
        }

        static class Year{
            public boolean leapYear(){
                if (((year%4==0)&&(year%100!=0))||(year%400==0))  {return  true;}
                else { return false;}
            }
            public int getDayOfYear(){
                if (leapYear())  {return  366;}
                else { return 365;}
            }

        }
        
        static class Month{
        }

        static class Day{
        }

    }
    

    public static void main(String[] args) {
        Date date1=new Date(24,2,2020);
        System.out.println(date1.getDayOfWeek());
        Date.Year year = new Date.Year();
        System.out.println(year.leapYear());
        System.out.println(year.getDayOfYear());
    }
}


