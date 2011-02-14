# Spring 3 Playground
This is just a little Spring 3 playground app that I write and mess with from time to time to checkout new features. This currently has:
	* caching enabled with 3.1.0's Cache Abstraction
	* XML-less component scan
	* RESTEasy based rest services

## Running It
First you'll need gradle installed. Clone this repository and type 'gradle jettyRun' from the command line. Once you see "> Building > :jettyRun" navigate to the following urls:

	http://localhost:8080/spring3-playground/messages
	http://localhost:8080/spring3-playground/messages/Hello
	http://localhost:8080/spring3-playground/messages/Appointment

That's all for now. :)
