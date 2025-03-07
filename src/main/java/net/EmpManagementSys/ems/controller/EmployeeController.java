package net.EmpManagementSys.ems.controller;

import lombok.AllArgsConstructor;
import net.EmpManagementSys.ems.dto.EmployeeDto;
import net.EmpManagementSys.ems.service.EmployeeSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeSevice employeeSevice;

    // create Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeSevice.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    // Get Employee by Id REST API
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId)
    {
        EmployeeDto employeeDto = employeeSevice.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    @GetMapping
    //Get All Employees REST API
    public ResponseEntity<List<EmployeeDto>> getAllEmployeess()
    {
        List<EmployeeDto> employeeDto = employeeSevice.getAllEmployees();
        return ResponseEntity.ok(employeeDto);
    }
}
