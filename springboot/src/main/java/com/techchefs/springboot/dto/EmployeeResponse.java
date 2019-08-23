package com.techchefs.springboot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
//@JsonRootName(value="employee-response")
public class EmployeeResponse {
	@JsonProperty("status-code")
	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeInfoBean> beans; 
}
