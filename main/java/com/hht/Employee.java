package com.hht;

import java.time.LocalDate;
import java.util.Date;

public class Employee
{
    //instance fields
    private String name;
    private double salary;
    private LocalDate hiredDay;

    //constructor
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hiredDay = LocalDate.of(year,month,day);
    }

    //mothod
    public String getName()
    {
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHiredDay() {
        return hiredDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

}