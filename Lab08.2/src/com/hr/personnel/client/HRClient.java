/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24), 40, 17));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 770000));
        // TODO: 9/13/2022 Create at least 1 HourlyEmployee and 1 SalariedEmployee, passing to the addEmployee method.
        dept.addEmployee(new HourlyEmployee("Giovanni", LocalDate.of(2022, 8, 29), 20, 40));
        dept.addEmployee(new SalariedEmployee("Giovanni", LocalDate.of(2022, 8, 29), 2000000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Employees get $$$$$$$$ (Pay its employees)
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}