package com.jamescarr.example;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryMessageRepository implements MessageRepository {
	private static final Logger LOG = LoggerFactory.getLogger(MemoryMessageRepository.class);
	private final Map<String, Message> messages = new ConcurrentHashMap<String, Message>();

	@Cacheable("message")
	public Message getMessage(String title){
		LOG.info("Fetching message");
		return messages.get(title);
	}
	@CacheEvict(value="message", key="message.title")
	public void save(Message message){
		LOG.info("Saving message");
		messages.put(message.getTitle(), message);
	}
	public Collection<Message> findAll() {
		return messages.values();
	}
	
	@PostConstruct
	public void addSomeDefaultMessages(){
		save(new Message("Hello", "Hello World"));
		save(new Message("Appointment", "Remember the milk!"));
	}
}
