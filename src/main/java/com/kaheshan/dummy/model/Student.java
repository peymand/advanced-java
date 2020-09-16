package com.kaheshan.dummy.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashMap;
@Entity
@Table(name = "student_tlb")
@Getter
@Setter
@NoArgsConstructor
public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	@Column(name = "country")
	private String country;
	@Transient
	private LinkedHashMap<String, String> countryOptions;

}
