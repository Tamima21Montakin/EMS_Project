package net.EmpManagementSys.ems.mapper;

import net.EmpManagementSys.ems.dto.EmployeeDto;
import net.EmpManagementSys.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        if (employee == null) return null; // Prevent NullPointerException

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail() // Ensure correct mapping
        );
    }

    public static Employee maptoEmployee(EmployeeDto employeeDto)
    {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
