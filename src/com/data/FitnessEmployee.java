package com.data;

public class FitnessEmployee extends FitnessPeople {
    int employeeTime;
    int employeeSalary;
    int employeeVacation;

    public FitnessEmployee(String name, String cpr, int employeeTime, int employeeSalary, int employeeVacation) {
        super(name, cpr);
        this.employeeTime = employeeTime;
        this.employeeSalary = employeeSalary;
        this.employeeVacation = employeeVacation;
    }

    public int getEmployeeTime() {
        return employeeTime;
    }

    public void setEmployeeTime(int employeeTime) {
        this.employeeTime = employeeTime;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeVacation() {
        return employeeVacation;
    }

    public void setEmployeeVacation(int employeeVacation) {
        this.employeeVacation = employeeVacation;
    }

    @Override
    public String toString() {
        return name + "    " + cpr + "    " + employeeTime + "    " + employeeSalary + "    " + employeeVacation;
    }
}

