package net.EmpManagementSys.ems.repository;

import net.EmpManagementSys.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    // EmployeeRepository will perform CRUD operations
}
