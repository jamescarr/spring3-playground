package com.jamescarr.example;

import java.util.Collection;

public interface MessageRepository {

	Message getMessage(String title);

	void save(Message message);

	Collection<Message> findAll();

}