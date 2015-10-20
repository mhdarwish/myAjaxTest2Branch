package com.example;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.PartialViewContext;

@ManagedBean
@SessionScoped
public class IndexBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String action() throws Exception {
		PartialViewContext pvc = FacesContext.getCurrentInstance().getPartialViewContext();
		String navigate = "";
		if(pvc.isPartialRequest()){
			Thread.sleep(6000);
			System.out.println(5 + 10 / 0); // This is an assumption
			System.out.println(message);
			navigate = "";
		}else{
			navigate = "";
			throw new IllegalArgumentException();
//			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("not ajax exception accourd.!"));
		}
		return navigate;
	}
}
