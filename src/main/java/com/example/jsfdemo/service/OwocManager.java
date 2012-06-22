package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Owoc;


@ApplicationScoped
public class OwocManager {
	
	private List<Owoc> dbo = new ArrayList<Owoc>();
	
	public void addOwoc(Owoc owoc){
		Owoc nowyOwoc = new Owoc();
		
		
		nowyOwoc.setName(owoc.getName());
		nowyOwoc.setFrom(owoc.getFrom());
		nowyOwoc.setPrice(owoc.getPrice());
		
		dbo.add(nowyOwoc);
	}
	
	public void deleteOwoc(Owoc owoc){
		Owoc owocTR = null;
		for(Owoc o : dbo){
			if(owoc.getName().equals(o.getName()) && owoc.getFrom().equals(o.getFrom())){
				owocTR = o;
				break;
			}
		}
		if (owocTR != null)
			dbo.remove(owocTR);
		
	}
	public List<Owoc> getAllOwoce() {
		return dbo;
	
	}
}
