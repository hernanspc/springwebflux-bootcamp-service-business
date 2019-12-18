package com.springwebflux.bootcamp.service.business.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebflux.bootcamp.service.business.app.model.Business;
import com.springwebflux.bootcamp.service.business.app.repository.IbusinessRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class BusinessServicesImplement implements IbusinessService {

	@Autowired
	IbusinessRepository repositorio;

	@Override
	public Flux<Business> getBusiness() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Mono<Business> createBusiness(Business business) {
		// TODO Auto-generated method stub
		System.out.println(business.getName());
		return repositorio.save(business);
	}

	@Override
	public Mono<Void> deleteBusiness(String Id) {
		// TODO Auto-generated method stub
		return repositorio.deleteById(Id);
	}

	@Override
	public Mono<Business> updateBusiness(Business business) {
		// TODO Auto-generated method stub
		return repositorio.save(business);
	}

	@Override
	public Mono<Business> getBusinessNrodoc(String nrodoc) {
		// TODO Auto-generated method stub
		return repositorio.findByNrodoc(nrodoc);
	}
	
	 
	
	
}
