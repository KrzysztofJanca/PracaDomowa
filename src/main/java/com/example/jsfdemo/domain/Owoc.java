package com.example.jsfdemo.domain;



import javax.validation.constraints.Size;

public class Owoc {
	
	private String name;
	private String from = "Wpisz kraj";
	private double price = 0.0;
	
	
	@Size(min = 2, max = 20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
