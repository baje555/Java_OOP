package Oop;

public class Employee {
    String name;
    double currentSalary;
    private double newSalary;


    Employee(String name, double currentSalary ){
        this.name = name;
        this.currentSalary = currentSalary;


    }

    public void setNewSalary(double percentage) {
        this.newSalary = this.currentSalary +(percentage / 100.0)* this.currentSalary;
    }

    public double getNewSalary() {
        return currentSalary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Pankaj ",1200.00);
        emp1.setNewSalary(120.00);
        double newsalary = emp1.getNewSalary();
        System.out.println("The new salary of "+emp1.name+" is "+emp1.getNewSalary());



    }
}
