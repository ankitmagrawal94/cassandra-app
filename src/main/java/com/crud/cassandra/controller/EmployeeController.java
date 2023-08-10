package com.crud.cassandra.controller;

import com.crud.cassandra.model.Employee;
import com.crud.cassandra.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("save")
    public Employee save(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getById/{id}")
    public Employee getById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return "employee with the id:"+id+" deleted successfully";
    }

}
