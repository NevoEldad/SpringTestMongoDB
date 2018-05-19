package com.spring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.beans.Factory;

public interface FactoryRepository extends MongoRepository<Factory, Long> {

	
}
