package com.alimert.controller;

import com.alimert.dto.DtoEmployee;

public interface IEmployeeController {
    public DtoEmployee findEmployeeById(Long id);
}
