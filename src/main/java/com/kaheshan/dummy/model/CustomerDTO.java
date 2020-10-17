package com.kaheshan.dummy.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    private int id;


    private String firstName;


    private String lastName;


    private String email;
}
