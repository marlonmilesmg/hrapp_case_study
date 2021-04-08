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
public class Employee {
    private int ID;
    private double salary;
    private String name;

    public Employee(int ID, double salary, String name) {
        this.ID = ID;
        this.salary = salary;
        this.name = name;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
    return "Employee " +getID() + " " + getName() + " " + getSalary();
    }
}
