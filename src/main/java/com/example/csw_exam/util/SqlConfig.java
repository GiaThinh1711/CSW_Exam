package com.example.csw_exam.util;

public class SqlConfig {
    public static final String INSERT_EMPLOYEE = "INSERT INTO employee (name,salary) VALUES (?,?)";
    public static final String LIST_EMPLOYEE = "SELECT * FROM employee";
    public static final String UPDATE_EMPLOYEE =
            "UPDATE employee SET Id=?,name=?,salary=? WHERE id = ?";
    public static final String DETAIL_EMPLOYEE = "select * from employee where id = ?";
}
