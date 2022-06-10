package com.example.csw_exam.repository;

import com.example.csw_exam.entity.Employee;

import java.util.List;

public interface EmployeeModel {
    Employee save(Employee employee);
    Employee update(Employee employee,int id);
    List<Employee> findAll();
    Employee findById(int id);
}
