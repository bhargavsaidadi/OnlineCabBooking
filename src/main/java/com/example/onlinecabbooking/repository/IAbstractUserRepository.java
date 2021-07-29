package com.example.onlinecabbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import com.example.onlinecabbooking.entities.AbstractUser;

@NoRepositoryBean
public interface IAbstractUserRepository extends JpaRepository<AbstractUser, Long>{

}
