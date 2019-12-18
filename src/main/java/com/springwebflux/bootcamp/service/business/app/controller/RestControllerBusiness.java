package com.springwebflux.bootcamp.service.business.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springwebflux.bootcamp.service.business.app.services.BusinessServicesImplement;
import com.springwebflux.bootcamp.service.business.app.model.Business;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class RestControllerBusiness {

 @Autowired
BusinessServicesImplement implement;
 
 @GetMapping("/getBusiness") 
 Flux<Business>getBusiness()
	{
	return implement.getBusiness();
	}	

@PostMapping("/createCurrentAccounts")
	Mono<Business> CreateBusiness(@RequestBody Business business){		
		return implement.createBusiness(business);		
	}
	
@DeleteMapping("/deleteCurrentAccounts/{id}")
	Mono<Void> deleteBusinessMono(@PathVariable String id){		
		return implement.deleteBusiness(id);		
	}
	
@PutMapping("/updateCurrentAccounts")
	Mono<Business> UpdateBusiness(@RequestBody Business business){		
		return implement.updateBusiness(business);		
	}

@GetMapping("/getCurrentAccountsNro/{nro}")
	Mono<Business>getBusinessNrodoc(@PathVariable String nro){		
		return implement.getBusinessNrodoc(nro);		
	}
	
@GetMapping("/txt")
	public String txt(){		
	return "Bienvenido Entidad Business";	
	}
  
	
	
	
}
