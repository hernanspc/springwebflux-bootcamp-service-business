package com.springwebflux.bootcamp.service.business.app.services;
import com.springwebflux.bootcamp.service.business.app.model.Business;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface IbusinessService {

	public Flux<Business>getBusiness();
	
	public Mono<Business>createBusiness(Business business);
	
	public Mono<Void>deleteBusiness(String id);
	
	public Mono<Business>updateBusiness(Business business);
	
	public Mono<Business>getBusinessNrodoc(String nrodoc);
	
	
}
