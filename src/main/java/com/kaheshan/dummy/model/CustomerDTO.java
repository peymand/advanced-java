package com.kaheshan.dummy.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    @NotNull
    @NotEmpty(message = "Name is mandatory")
    private String firstName;

    private String lastName;

    @NotEmpty(message = "Email is mandatory")
    @Email(message = "email should be a valid email")
    private String email;

    @Getter
    @Setter
    public static class Info{

        private int id;

    }
}
