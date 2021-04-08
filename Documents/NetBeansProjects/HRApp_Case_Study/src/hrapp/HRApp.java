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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting");
        
        Employee e1 = new Employee(101, 1500.00, "Marlon");
        Employee e2 = new Employee(102, 1500.00, "Pride");
        
        System.out.println("Emp: " + e1);
        System.out.println("Emp: " + e2);
    }
    
    
}
