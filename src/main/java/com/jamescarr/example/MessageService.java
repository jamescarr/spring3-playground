package com.jamescarr.example;

import java.util.Collection;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/messages")
@Produces("application/json")
public interface MessageService {

	@GET
	@Path("/{title}")
	Message getMessage(@PathParam("title") String title);

	@GET
	@Path("/")
	Collection<Message> getMessages();
}