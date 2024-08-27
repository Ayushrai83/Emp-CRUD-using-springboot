package org.gurukul.em_project.service;
import java.util.List;

import org.gurukul.em_project.models.Employee;


public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
}
