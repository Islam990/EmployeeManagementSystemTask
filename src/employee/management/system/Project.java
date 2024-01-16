/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;


/**
 *
 * @author islam.gad
 */
public class Project {

    private final String name;
    private final String descripation;

    public Project(String name, String descripation) {
        this.name = name;
        this.descripation = descripation;
    }

    @Override
    public String toString() {
        return "{" + "name = " + name + ", descripation = " + descripation + '}';
    }
}
