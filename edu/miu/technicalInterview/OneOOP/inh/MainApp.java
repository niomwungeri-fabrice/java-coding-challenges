package edu.miu.technicalInterview.OneOOP.inh;


import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmail("emp1");
        employee.setDepartment("Engineering");
        employee.setUsername("username1");

        System.out.println(employee);

        Engineer engineer = new Engineer();
        engineer.setEmail("emp1");
        engineer.setDepartment("Engineering");
        engineer.setUsername("username1");
        engineer.setTechStack(Arrays.asList("bar", "foo"));

        System.out.println(engineer);
    }
}
