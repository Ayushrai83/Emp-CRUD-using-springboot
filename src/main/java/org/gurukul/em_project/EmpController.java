package org.gurukul.em_project;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController {
    
    List<Employee> employees= new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //TODO: process POST request
        employees.add(employee);
        return "Saved Successfully";
    }
    
}
