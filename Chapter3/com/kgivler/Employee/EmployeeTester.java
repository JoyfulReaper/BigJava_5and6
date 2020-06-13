package com.kgivler.Employee;

public class EmployeeTester {
    public static void main(String[] args)
    {
        Employee fry = new Employee("Phillip Fry", 12000);
        System.out.println("getName(): " + fry.getName() + " expected: Phillip Fry" );
        System.out.println("getSalary(): " + fry.getSalary() + " expected: 12000" );
        fry.raiseSalary(3);
        System.out.println("getSalary(): " + fry.getSalary() + " expected: 12360" );
    }    
}