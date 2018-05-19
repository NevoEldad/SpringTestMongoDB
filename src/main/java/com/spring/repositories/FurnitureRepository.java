package com.spring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.beans.Furniture;

public interface FurnitureRepository extends MongoRepository<Furniture, Long> {

}
