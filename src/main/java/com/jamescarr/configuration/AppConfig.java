package com.jamescarr.configuration;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.jamescarr.example.MessagePrinter;

@Configuration
@ComponentScan("com.jamescarr.example")
@ImportResource({
	"classpath:com/jamescarr/example/cache-context.xml", 
	"classpath:springmvc-resteasy.xml"})
public class AppConfig {
	@Autowired
	private MessagePrinter messagePrinter;
	@PostConstruct
	public void doSomething(){
		messagePrinter.printMessage("Hello");
		messagePrinter.printMessage("Hello");
		
	}
}
