package org.gurukul.em_project;

import java.util.List;
import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees= new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }

}
