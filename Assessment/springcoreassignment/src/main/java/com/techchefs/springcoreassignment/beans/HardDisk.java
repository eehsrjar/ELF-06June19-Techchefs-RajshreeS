package com.techchefs.springcoreassignment.beans;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class HardDisk implements StorageDevice{
	private String capacity;
	private String writingSpeed;
	private String readingSpeed;

	public void read() {
		log.info("HardDisk With Reading Speed" + this.readingSpeed);
	}

	public void write() {
		log.info("HardDisk With Writing Speed" + this.writingSpeed);
	}

	public void format() {
		log.info("HardDisk With capacity" + this.capacity);
	}

}
