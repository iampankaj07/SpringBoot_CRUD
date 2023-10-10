package com.crud.crud_springboot.service;

import com.crud.crud_springboot.model.EmployeeModel;
import com.crud.crud_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeModel postData(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public void updteData(EmployeeModel employee, int id) {
//        employeeRepository.save(employee);
    }

    public List<EmployeeModel> getData() {
//        List<EmployeModel> emplyee = new ArrayList<EmployeModel>();
        return employeeRepository.findAll();
    }
    public void  deleteData(int id){
        employeeRepository.deleteById(id);
    }
}
