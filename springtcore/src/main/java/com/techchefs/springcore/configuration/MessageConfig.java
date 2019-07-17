package com.techchefs.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {
	@Bean
	public MessageBean	getMessageBean() {
		MessageBean bean=new MessageBean();
		bean.setMessage("Spring Classses");
		return bean;
	}
}
