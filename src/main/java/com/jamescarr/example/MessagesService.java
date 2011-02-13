package com.jamescarr.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Service;
@Service
@Path("/messages")
public class MessagesService {
	@GET
	@Path("/{title}")
	public Message getMessage(@PathParam("title") String title){
		return new Message(title, "Hello World");
	}
}
