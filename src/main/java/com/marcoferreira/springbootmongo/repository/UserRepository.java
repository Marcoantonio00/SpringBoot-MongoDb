package com.marcoferreira.springbootmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcoferreira.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
