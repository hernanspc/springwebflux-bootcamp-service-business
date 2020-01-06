package com.springwebflux.bootcamp.service.business.app.model;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document(collection="business")
public class Business {
	
	  @Id
	  private String id;

	  @NotEmpty
	  private String name;

	  @NotEmpty
	  private String ruc;

	  @NotEmpty
	  private String representLegal;

	  @NotEmpty
	  private String typeDoc;

	  @NotEmpty
	  private String numDoc;

	  @NotEmpty
	  @JsonFormat(pattern = "dd-MM-yyyy")
	  private Date createdAt;
	
	 
	
}
