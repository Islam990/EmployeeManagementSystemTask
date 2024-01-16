/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

/**
 *
 * @author islam.gad
 */
public class Developer extends Employee {

    private final double baseSalary;

    public Developer(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        // Salary calculation logic for managers
        // Example: base salary + bonus
        return baseSalary + 500;
    }

    @Override
    public String toString() {
        return super.toString() + "Total Salary = " + calculateSalary() + "}";
    }
}
