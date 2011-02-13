package com.jamescarr.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagePrinter {
	private final MessageRepository repository;

	@Autowired
	public MessagePrinter(MessageRepository repository){
		this.repository = repository;
	}
	
	public void printAll(){
		for (Message message : repository.findAll()) {
			System.out.println(message.getTitle() +": "+ message.getText());
		}
	}
	
	public void printMessage(String title){
		Message m = repository.getMessage(title);
		System.out.println("Title: " + m.getTitle());
		System.out.println("Message: " + m.getText());
	}
}
