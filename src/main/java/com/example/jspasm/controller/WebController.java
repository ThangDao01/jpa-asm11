package com.example.jspasm.controller;

import com.example.jspasm.entity.EmployeeEntity;
import com.example.jspasm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping({"/", "/index"})

    public List<EmployeeEntity> index(Model model) {
        List<EmployeeEntity> result = employeeService.getAllEmployee();
        model.addAttribute("result", result);

        return result;

    }
    @GetMapping({"/create-employee"})

    public String createForm(Model model) {

        return "create";

    }
    @PostMapping({"/create-employee"})

    public String create(Model model,@RequestParam Map<String, String> params) {
        String name = params.get("name");
        String wage = params.get("wage");
        employeeService.createEmployee(new EmployeeEntity(name,Integer.valueOf(wage)));
        return "redirect:index";
    }

    @PostMapping({"/search-employee"})

    public String search(Model model,@RequestParam Map<String, String> params) {
        String searchValue = params.get("name");
        model.addAttribute("result",employeeService.search(searchValue));

        return "index";
    }
}
