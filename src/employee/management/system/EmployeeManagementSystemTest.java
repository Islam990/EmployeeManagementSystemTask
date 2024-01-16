/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee.management.system;

import java.util.Date;

/**
 *
 * @author islam.gad
 */
public class EmployeeManagementSystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Projects
        Project project1 = new Project("Project 1", "Student Management System");
        Project project2 = new Project("Project 2", "Employee Management System");

        // Employees
        Manager manager = new Manager("Islam Gad", 35, 5000);
        manager.setContractDuaration(5);
        manager.setDataEntry(new Date());
        manager.setNoticePeriod(2);
        manager.addProject(project1);
        manager.addProject(project2);
        System.out.println(manager);
        System.out.println("-----------------------------------------");

        Developer developer = new Developer("Khaled Mohamed", 28, 4000);
        developer.setContractDuaration(2);
        developer.setDataEntry(new Date());
        developer.setNoticePeriod(1);
        developer.addProject(project1);
        System.out.println(developer);
        System.out.println("-----------------------------------------");

        Specialist specialist = new Specialist("Mohamed Shehta", 28, 3000);
        specialist.setContractDuaration(1);
        specialist.setDataEntry(new Date());
        specialist.setNoticePeriod(1);
        specialist.addProject(project1);
        specialist.addProject(project2);
        System.out.println(specialist);
        System.out.println("-----------------------------------------");

    }

}
