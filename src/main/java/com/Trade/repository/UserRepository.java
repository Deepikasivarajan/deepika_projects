package com.Trade.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Trade.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	@Query("select u from User u where u.userId=?1")
	User findByUserId(int id);

}
