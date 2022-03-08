package edu.miu.technicalInterview.OneOOP.inh;

public class Employee extends Person {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + "], " + super.toString();
    }

}