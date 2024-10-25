package com.alimert.service;

import com.alimert.dto.DtoEmployee;
import com.alimert.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
