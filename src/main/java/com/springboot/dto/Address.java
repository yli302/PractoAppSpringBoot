package com.springboot.dto;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
	private String hno;
	private String street, city, state, country;
	int zipcode;
}
