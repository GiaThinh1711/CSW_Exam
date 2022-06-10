package com.example.csw_exam.repository;

import com.example.csw_exam.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeModel implements EmployeeModel{
    private static List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee, int id) {
        int foundIndex = -1;
        for(int i = 0; i < employees.size(); i++){
            if (employees.get(i).getId() == id){
                foundIndex = i;
            }
        }
        if (foundIndex != -1){
            employees.get(foundIndex).setName(employee.getName());
            employees.get(foundIndex).setSalary(employee.getSalary());
        }
        return employees.get(foundIndex);
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findById(int id) {
        int foundIndex = -1;
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getId() == id){
                foundIndex = i;
            }
        }
        if (foundIndex != -1){
            return employees.get(foundIndex);
        }
        return null;
    }
}
