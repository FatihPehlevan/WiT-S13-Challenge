package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        systemTest();
    }

    public static void systemTest(){
        Company company = new Company(1, "Comp", 1000, new String[0]);
        Employee employee = new Employee(1, "Hang Time", "hangtime@email.com", "1234", new String[0]);
        Healthplan healthplan = new Healthplan(1, "basic", Plan.BASIC);

        System.out.println(company.toString());
        System.out.println(employee.toString());
        System.out.println(healthplan.toString());


    }
}