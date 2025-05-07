package com.practice.Application;

import com.practice.dto.Employee;

/**
 * sample Employee application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Application started...." );

        Employee  employee = new Employee();
        employee.setEmployeeId(10);
        employee.setEmployeeName("John Steve");
        employee.setEmployeeSalary(10000);

        System.out.println("Employee Details: \t");
        System.out.println("Employee Id: \t"+employee.getEmployeeId());
        System.out.println("Employee Name"+employee.getEmployeeName());
        System.out.println("Employee Salary"+employee.getEmployeeSalary());
    }
}
