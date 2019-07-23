package com.techchefs.springcoreassignment.beans;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class PenDrive implements StorageDevice {
	private String capacity;
	private String writingSpeed;
	private String readingSpeed;

	public void read() {
		log.info("PenDrive With Reading Speed" + this.readingSpeed);
	}

	public void write() {
		log.info("PenDrive With Writing Speed" + this.writingSpeed);
	}

	public void format() {
		log.info("PenDrive With capacity" + this.capacity);
	}

}
