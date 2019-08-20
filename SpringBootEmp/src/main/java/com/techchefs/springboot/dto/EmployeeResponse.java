package com.techchefs.springboot.dto;


import java.util.List;

import lombok.Data;

@Data
public class EmployeeResponse {
	private String message;
	private int statusCode;
	private String description;
	private List<EmployeeInfoBean> beans;
}
