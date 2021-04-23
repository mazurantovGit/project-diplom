package com.floor.web.repository;


import com.floor.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<User, String> {

}
