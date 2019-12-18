package com.springwebflux.bootcamp.service.business.app.services;

import com.springwebflux.bootcamp.service.business.app.model.Business;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IbusinessService {

	Flux<Business>getBusiness();
	
	Mono<Business>createBusiness(Business business);
	
	Mono<Void>deleteBusiness(String Id);
	
	Mono<Business>updateBusiness(Business business);
	
	Mono<Business>getBusinessNrodoc(String nrodoc);
	
	
}
