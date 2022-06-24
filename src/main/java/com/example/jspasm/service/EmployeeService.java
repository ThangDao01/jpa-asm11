package com.example.jspasm.service;

import com.example.jspasm.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployee();

    EmployeeEntity createEmployee(EmployeeEntity p);

    List<EmployeeEntity> search(String name);

}
