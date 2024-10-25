package com.alimert.controller;

import com.alimert.dto.DtoEmployee;
import com.alimert.model.RootEntity;

public interface IEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
