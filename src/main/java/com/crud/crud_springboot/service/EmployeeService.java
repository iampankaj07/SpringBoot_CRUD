package com.crud.crud_springboot.service;

import com.crud.crud_springboot.model.EmployeeModel;
import com.crud.crud_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeModel postData(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeModel updateData(EmployeeModel employee, int id) {
        Optional<EmployeeModel> dataToUpdate = employeeRepository.findById(id);
        if (dataToUpdate.isPresent()) {
            EmployeeModel employeeData = dataToUpdate.get();
            employeeData.setEmployeName(employee.getEmployeName());
            employeeData.setAddress(employee.getAddress());
            employeeData.setSallary(employee.getSallary());
            employeeData.setPhoneNo(employee.getPhoneNo());
            return employeeRepository.save(employeeData);

        }
        else return null;

    }

    public List<EmployeeModel> getData() {
//        List<EmployeModel> emplyee = new ArrayList<EmployeModel>();
        return employeeRepository.findAll();
    }
    public String  deleteData(int id){
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
        return "Employee deleted successfully";
        } else  return  "No employee record found";
    }
}
