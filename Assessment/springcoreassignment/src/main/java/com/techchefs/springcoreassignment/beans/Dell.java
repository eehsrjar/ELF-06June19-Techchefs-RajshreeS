package com.techchefs.springcoreassignment.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.techchefs.springcoreassignment.interfaces.Laptop;
import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class Dell implements Laptop{
	private String brand;
	private String color;
	private double cost;
	private String weight;
	private String ram;
	private String os;
	@Autowired
	private StorageDevice device;
	public void display() {
		log.info("Dell Display");
	}

	public void process() {
		log.info("Dell Process");
	}

	public void showSpecification() {
		log.info("Brand :"+this.brand+"Color:"+this.color+"Ram Size:"+this.ram+"Cost:"+this.cost);		
	}

}
