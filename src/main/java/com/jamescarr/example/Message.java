package com.jamescarr.example;

public class Message {
	private String text;
	private String title;
	public Message(){}
	public Message(String title, String text) {
		this.text = text;
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
