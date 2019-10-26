package com.sandeep.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.model.User;
@Repository
public interface UserDao extends CrudRepository<User, Integer>{

	User findByUsername(String username);
}
