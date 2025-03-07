package net.EmpManagementSys.ems.impl;

import lombok.AllArgsConstructor;
import net.EmpManagementSys.ems.dto.EmployeeDto;
import net.EmpManagementSys.ems.entity.Employee;
import net.EmpManagementSys.ems.exception.ResourceNotFoundException;
import net.EmpManagementSys.ems.mapper.EmployeeMapper;
import net.EmpManagementSys.ems.repository.EmployeeRepository;
import net.EmpManagementSys.ems.service.EmployeeSevice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceDtoImpl implements EmployeeSevice {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
       Employee employee =  employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee Id is invalid : "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        return null;
    }
}
