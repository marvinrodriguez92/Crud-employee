package com.javaguides.ems_backend.service;


import com.javaguides.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto>  getAllEmployees();

    EmployeeDto UpdateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void DeleteEmployee(Long employeeId);

}
