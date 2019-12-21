package com.springwebflux.bootcamp.service.business.app.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.springwebflux.bootcamp.service.business.app.model.Business;
import reactor.core.publisher.Mono;
@Repository
public interface IbusinessRepository extends ReactiveMongoRepository<Business, String> {

	Mono<Business> findByNrodoc(String nrodoc);
	
}
