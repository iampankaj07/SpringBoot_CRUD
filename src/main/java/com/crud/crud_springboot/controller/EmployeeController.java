package com.crud.crud_springboot.controller;

import com.crud.crud_springboot.dto.ListResponse;
import com.crud.crud_springboot.dto.Response;
import com.crud.crud_springboot.model.EmployeeModel;
import com.crud.crud_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
                .message("Success")
                .code(200)
                .data(data)
                .build();
    }

    @PostMapping("postEmployee")
    public EmployeeModel postEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.postData(employee);
    }
    @PatchMapping("updateEmployee/{id}")
    public Response<EmployeeModel> updateEmployee(@PathVariable("id") int id, @RequestBody EmployeeModel employee) {
   EmployeeModel updatedData= employeeService.updateData(employee,id);
   System.out.println(updatedData);
    return new Response<EmployeeModel>(200,"Update Success",updatedData);
    }
    @DeleteMapping("delete/{id}")
    public  String deleteEmployee(@PathVariable("id") int id){
      return   employeeService.deleteData(id);
    }
}
