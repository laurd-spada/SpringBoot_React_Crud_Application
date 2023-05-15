package com.devsparda.employee.service;

import com.devsparda.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeByyId(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
