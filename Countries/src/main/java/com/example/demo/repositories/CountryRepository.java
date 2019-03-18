package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entites.Country;

@Component
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
