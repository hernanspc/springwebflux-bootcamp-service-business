package com.springwebflux.bootcamp.service.business.app.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="business")
public class Business {
	
@Id
	private String id;
	private String nrodoc;
	private String name;
	private String mail;
	private String phone;
	private String status;
	private String client_type;
	
	 
	
}
