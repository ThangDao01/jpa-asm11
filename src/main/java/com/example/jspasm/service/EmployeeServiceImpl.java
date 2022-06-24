package com.example.jspasm.service;

import com.example.jspasm.entity.EmployeeEntity;
import com.example.jspasm.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }


    @Override
    public EmployeeEntity createEmployee(EmployeeEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public List<EmployeeEntity> search(String name) {
        return employeeRepo.findEmployeeByNameCustom(name);
    }
}
