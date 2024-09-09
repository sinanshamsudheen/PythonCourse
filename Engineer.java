
public class Engineer extends Employee {
    Engineer(){
        System.out.println("Name of the class is Engineer");
    }
    @Override // Override the calcSalary method
    public void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }

    public static void main(String[] args) {
        Engineer eng = new Engineer();
        // Employee empl = new Employee();

        // empl.display();
        // empl.calcSalary();

        eng.display();
        eng.calcSalary();
    }
}
