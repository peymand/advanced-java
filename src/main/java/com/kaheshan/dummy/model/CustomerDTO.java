package com.kaheshan.dummy.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    private int id;

    @NotEmpty(message = "Name is mandatory")
    @Min(1)
    private String firstName;


    private String lastName;

    @NotEmpty(message = "Email is mandatory")
    @Email(message = "email should be a valid email")
    private String email;
}
