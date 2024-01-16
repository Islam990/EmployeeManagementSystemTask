/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author islam.gad
 */
public class Employee extends Person implements ContractDepartment {

    private Date entryDate;
    private int contractDuration;
    private int noticePeriod;
    private final List<Project> projects;

    public Employee(String name, int age) {
        super(name, age);
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }

    @Override
    public void setDataEntry(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public void setContractDuaration(int years) {
        this.contractDuration = years;
    }

    @Override
    public void setNoticePeriod(int months) {
        this.noticePeriod = months;
    }

    @Override
    public String toString() {
        return super.toString() + "entryDate = " + entryDate + ", contractDuration = " + contractDuration + ", noticePeriod = " + noticePeriod + ", projects=" + projects + ", ";
    }
}
