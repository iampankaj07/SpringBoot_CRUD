package com.crud.crud_springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;




    @NotBlank(message = "Please enter employee name")
    @NotNull(message = "Please enter employee name")
    private String employeName;


    private String phoneNo;
    private String sallary;


    private String address;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String employeName, String phoneNo, String sallary, String address) {
        this.id = id;
        this.employeName = employeName;
        this.phoneNo = phoneNo;
        this.sallary = sallary;
        this.address = address;
    }


}

