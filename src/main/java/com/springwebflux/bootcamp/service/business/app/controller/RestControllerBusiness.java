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

@PostMapping("/createBusiness")
	Mono<Business> createBusiness(@RequestBody Business business){		
		return implement.createBusiness(business);		
	}
	
@DeleteMapping("/deleteBusiness/{id}")
	Mono<Void> deleteBusinessMono(@PathVariable String id){		
		return implement.deleteBusiness(id);		
	}
	
@PutMapping("/updateBusiness")
	Mono<Business> updateBusiness(@RequestBody Business business){		
		return implement.updateBusiness(business);		
	}

@GetMapping("/getBusinessNrodoc/{nrodoc}")
	Mono<Business>getBusinessNrodoc(@PathVariable String nrodoc){		
		return implement.getBusinessNrodoc(nrodoc);
	}
	
@GetMapping("/txt")
	public String txt(){		
	return "Bienvenido Entidad Business";	
	}
  
	
	
	
}
