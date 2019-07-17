package com.techchefs.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class MessageBean {
	private String message;
	@PostConstruct
	public void init() {
		log.info("Init");
	}
	@PreDestroy
	public void destroy() {
		log.info("Destroy");
	}
}
