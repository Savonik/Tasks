package jc01_2020.Savonik.lesson06.task01;

import static java.lang.String.format;

public class Time {
    int seconds;
    int minutes;
    int hours;

    public Time() {
    }
    
    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    
    public Time(int seconds) {
        hours = seconds/3600;
        minutes = (seconds%3600)/60 ;
        this.seconds = seconds%60;
    }
    
    public void AlltimePrint(int seconds) {
        if (seconds>3600*24) {
            System.out.println("введено некорректное число секунд");
        }
        else {
        this.seconds = seconds%60;
        hours = seconds/3600;
        minutes = (seconds%3600)/60;
        System.out.println(String.format("%2dчас(а): %2dминут: %2dсекунд(ы)", hours, minutes, this.seconds));}
    }
    
    int getFullSeconds() {
        return seconds + 60 * seconds + 3600 * seconds;
    }

    public void timePrint() {
        System.out.println(this.getFullSeconds());
    }
    
    public byte CompareTo(Time SecondTime) {
        if (SecondTime.getFullSeconds() > this.getFullSeconds()) {
            return 1;
        }
        else if (SecondTime.getFullSeconds() < this.getFullSeconds()) {
            return -1;
        } else return 0;
    } 
    

}

