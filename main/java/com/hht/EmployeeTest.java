package com.hht;


public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("zhang", 75000, 1994,8,5);
        staff[1] = new Employee("guo",84000,1995,4,8);
        staff[2] = new Employee("hu",67000,1990,8,13);

        //raise everyone's salary by 5%
        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for(Employee employee:staff){
            System.out.println("name:"+employee.getName()+"  salary:"+employee.getSalary()+"  hired:"+employee.getHiredDay());
        }
    }
}
