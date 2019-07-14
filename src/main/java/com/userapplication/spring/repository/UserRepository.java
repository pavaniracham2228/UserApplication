package com.userapplication.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.userapplication.spring.bean.User;
public interface UserRepository extends CrudRepository<User, String>{

}
