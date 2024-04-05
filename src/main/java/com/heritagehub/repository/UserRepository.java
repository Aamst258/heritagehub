package com.heritagehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heritagehub.entities.User;

public interface UserRepository  extends JpaRepository<User, Integer>  {

}
