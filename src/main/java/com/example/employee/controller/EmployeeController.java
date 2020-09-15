package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeRepository repository;

    @PostMapping("/employee/register")
    public  String register(@RequestBody Employee employee){
       repository.save(employee);
       return "success";
    }

    @PostMapping("/employee/allEmployees")
    public List<Employee> allEmployees(){
        return repository.findAll();
    }

    @GetMapping("/employee/getEmployee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return repository.findById(id);
    }
}
