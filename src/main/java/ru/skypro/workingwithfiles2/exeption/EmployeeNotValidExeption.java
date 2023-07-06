package ru.skypro.workingwithfiles2.exeption;


import ru.skypro.workingwithfiles2.dto.EmployeeDto;

public class EmployeeNotValidExeption extends RuntimeException{
    private final EmployeeDto employee;

    public EmployeeNotValidExeption(EmployeeDto employee) {
        this.employee = employee;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }
}