package com.example.jsfdemo.domain;

import javax.validation.constraints.Size;


public class Person {
	
	private String firstName = "unknown";
	private String nip = "";
	private String from;
	
	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Size(min = 10, max = 10)
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
						
}
