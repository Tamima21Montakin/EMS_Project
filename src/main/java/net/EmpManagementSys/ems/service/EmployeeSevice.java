package net.EmpManagementSys.ems.service;

import net.EmpManagementSys.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeSevice {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);
}
