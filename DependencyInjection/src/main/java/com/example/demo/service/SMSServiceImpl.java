package com.example.demo.service;

public class SMSServiceImpl implements MessageService{

	@Override
	public void sendMessage(String msg, String rec) {
		//logic to SMS
		System.out.println("SMS sent to " + rec + " with Message=" + msg);
	}

}
