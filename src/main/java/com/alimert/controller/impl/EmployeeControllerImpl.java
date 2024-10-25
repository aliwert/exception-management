package com.alimert.controller.impl;

import com.alimert.controller.IEmployeeController;
import com.alimert.dto.DtoEmployee;
import com.alimert.model.RootEntity;
import com.alimert.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class EmployeeControllerImpl extends BaseControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping(path = "/list/{id}")
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
