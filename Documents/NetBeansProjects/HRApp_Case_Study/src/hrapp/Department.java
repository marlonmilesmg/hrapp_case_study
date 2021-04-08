/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author Marlon Miles MG
 */
public class Department {
    
    private String name;
    private Employee[] emps = new Employee[10];
    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmployee(Employee anEmployee){
    if(lastAddedEmployeeIndex < employees.length){
    lastAddedEmployeeIndex++;
    
    }
    }
}
