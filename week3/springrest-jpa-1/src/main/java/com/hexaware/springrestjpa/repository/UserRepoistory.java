package com.hexaware.springrestjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Users;

@Repository
public interface UserRepoistory extends JpaRepository<Users, Integer>{

}
