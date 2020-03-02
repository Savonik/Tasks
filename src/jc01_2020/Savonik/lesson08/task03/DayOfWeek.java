package jc01_2020.Savonik.lesson08.task03;

public enum DayOfWeek {
    Sunday(0),
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6);
    
    int number;
    DayOfWeek(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
}
