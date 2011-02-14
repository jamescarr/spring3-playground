package com.jamescarr.example;

import java.util.Collection;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Messages implements MessageService {
	private final MessageRepository messageRepository;
	@Autowired
	public Messages(MessageRepository repository){
		messageRepository = repository;
	}
	public Message getMessage(@PathParam("title") String title){
		return messageRepository.getMessage(title);
	}
	public Collection<Message> getMessages() {
		return messageRepository.findAll();
	}
}
