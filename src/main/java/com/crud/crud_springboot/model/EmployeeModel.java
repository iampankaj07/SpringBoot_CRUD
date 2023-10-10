package com.crud.crud_springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer id;

    private  String employeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  String phoneNo;
    private  String sallary;


    private  String address;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String employeName, String phoneNo, String sallary, String address) {
        this.id = id;
        this.employeName = employeName;
        this.phoneNo = phoneNo;
        this.sallary = sallary;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSallary() {
        return sallary;
    }

    public void setSallary(String sallary) {
        this.sallary = sallary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

