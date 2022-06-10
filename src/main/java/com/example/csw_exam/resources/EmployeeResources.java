package com.example.csw_exam.resources;

import com.example.csw_exam.entity.Employee;
import com.example.csw_exam.repository.EmployeeModel;
import com.example.csw_exam.repository.InMemoryEmployeeModel;

import javax.ws.rs.*;
import java.util.List;
@Path("/employees")
@Produces("application/json")
@Consumes("application/json")
public class EmployeeResources {
    EmployeeModel employeeModel;
    public EmployeeResources(){
        this.employeeModel = new InMemoryEmployeeModel();
    }
    @GET
    @Produces("application/json")
    public List<Employee> findAll(){
        return employeeModel.findAll();
    }

    @Path("{id}")
    @GET
    @Produces("application/json")
    public Employee findById(@PathParam("id") int id){
        return employeeModel.findById(id);
    }
    @POST
    public Employee create(Employee employee){
        return employeeModel.save(employee);
    }
    @PUT
    @Path("{id}")
    public Employee update(@PathParam("id") int id, Employee updateEmployee){
        return employeeModel.update(updateEmployee,id);
    }
}
