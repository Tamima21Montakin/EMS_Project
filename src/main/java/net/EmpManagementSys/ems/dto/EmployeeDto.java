package net.EmpManagementSys.ems.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// DTO is intended to transfer data between client and server
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
