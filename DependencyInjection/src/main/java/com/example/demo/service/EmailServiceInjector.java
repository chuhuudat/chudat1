package com.example.demo.service;

import com.example.demo.comsumer.Consumer;
import com.example.demo.comsumer.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
