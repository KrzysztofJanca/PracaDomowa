package com.example.jsfdemo.web;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsfdemo.domain.Owoc;
import com.example.jsfdemo.service.OwocManager;

@SessionScoped
@Named("owocBean")
public class OwocFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Owoc owoc = new Owoc();

	private ListDataModel<Owoc> owoce = new ListDataModel<Owoc>();

	@Inject
	private OwocManager om;

	public Owoc getOwoc() {
		return owoc;
	}

	public void setOwoc(Owoc owoc) {
		this.owoc = owoc;
	}

	public ListDataModel<Owoc> getAllOwoce() {
		owoce.setWrappedData(om.getAllOwoce());
		return owoce;
	}

	// Actions
	public String addOwoc() {
		om.addOwoc(owoc);
		return "showOwoce";
		//return null;
	}

	public String deleteOwoc() {
		Owoc owocTR = owoce.getRowData();
		om.deleteOwoc(owocTR);
		return null;
	}
}