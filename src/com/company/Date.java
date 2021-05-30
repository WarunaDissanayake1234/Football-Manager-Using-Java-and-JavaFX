package com.company;

import java.io.Serializable;

public class Date implements Serializable, Comparable<Integer>{
    
    private static final long serialVersionUID = 1L;
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day == 0) System.out.println("INVALID DATE");
        if (month == 2 && year % 4 == 0 && day > 29) System.out.println("INVALID DATE!");
        else if ((month == 2) && (day > 28)) System.out.println("INVALID DATE!");
        else if (((month == 7) || (month % 2 == 0)) && (day > 31)) System.out.println("INVALID DATE!");
        else if ((month % 2 == 1) && (day > 30)) System.out.println("INVALID DATE!");
        else this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month > 12) || (month < 1)) System.out.println("INVALID MONTH!");
        else this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2000 || year > 2100) {
            System.out.println("INVALID YEAR!");
        } else this.year = year;
    }

    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }


    @Override
    public int compareTo(Integer date) {
        if (date.equals(this.month)){
            return date.compareTo(this.day);
        }
        else return date.compareTo(this.month);
    }
}
