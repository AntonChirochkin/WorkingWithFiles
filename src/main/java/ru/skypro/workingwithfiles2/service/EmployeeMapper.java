package ru.skypro.workingwithfiles2.service;


import org.springframework.stereotype.Component;
import ru.skypro.workingwithfiles2.department.Employee;
import ru.skypro.workingwithfiles2.department.Position;
import ru.skypro.workingwithfiles2.dto.EmployeeDto;
import ru.skypro.workingwithfiles2.dto.PositionDto;

import java.util.Optional;

@Component
public class EmployeeMapper {
    public Employee toEntity(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setSalary(employeeDto.getSalary());

        var positionDto = employeeDto.getPosition();
        var position = new Position();
        position.setId(positionDto.getId());
        position.setPosition(positionDto.getName());
        employee.setPosition(position);
        return employee;
    }

    public EmployeeDto toDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSalary(employee.getSalary());

        var position = employee.getPosition();
        var positionDto = new PositionDto(position.getId(), position.getPosition());

        employeeDto.setPosition(positionDto);
        return employeeDto;
    }
}