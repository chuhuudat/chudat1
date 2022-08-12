package com.example.demo.comsumer;

import com.example.demo.service.MessageService;

public class MyDIApplication implements Consumer{
	
	private MessageService messageService;
	
	
	
	public MyDIApplication(MessageService messageService) {
		this.messageService = messageService;
	}



	@Override
	public void processMessages(String msg, String rec) {
		this.messageService.sendMessage(msg, rec);
		
	}

}
