/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

/**
 *
 * @author islam.gad
 */
public class Manager extends Employee {

    private final double baseSalary;

    public Manager(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        // Salary calculation logic for managers
        // Example: base salary + bonus
        return baseSalary + 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "Total Salary = " + calculateSalary() + "}";
    }

}
