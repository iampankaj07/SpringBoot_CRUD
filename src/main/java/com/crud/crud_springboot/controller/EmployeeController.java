package com.crud.crud_springboot.controller;

import com.crud.crud_springboot.dto.ListResponse;
import com.crud.crud_springboot.dto.Response;
import com.crud.crud_springboot.model.EmployeeModel;
import com.crud.crud_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class EmployeeController {


    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("getEmployee")
    public Response<List<EmployeeModel>> getAllEmployee() {
        List<EmployeeModel> data = employeeService.getData();
        return Response
                .<List<EmployeeModel>>builder()

                .code(200)
                .data(data)
                .build();
    }

    @PostMapping("postEmployee")
    public EmployeeModel postEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.postData(employee);
    }
}
