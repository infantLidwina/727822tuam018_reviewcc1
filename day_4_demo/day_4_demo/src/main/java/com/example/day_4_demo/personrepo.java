package com.example.day_4_demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personrepo extends JpaRepository<person,Integer>
{
   
}
