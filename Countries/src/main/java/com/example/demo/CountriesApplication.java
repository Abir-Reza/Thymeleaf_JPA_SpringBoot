package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entites.Country;
import com.example.demo.repositories.CountryRepository;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}
	
	@Override  //CommandLineRunner interface helps to apply this method
	public void run(String... args) throws Exception{
		countryRepository.save(new Country("Bangladesh","Dhaka"));
		countryRepository.save(new Country("India","Delhi"));
		countryRepository.save(new Country("Pakistan","Islamabad"));
		countryRepository.save(new Country("England","London"));
		countryRepository.save(new Country("Japan","Tokiyo"));
		countryRepository.save(new Country("USA","Washington"));
		countryRepository.save(new Country("Mexico","Mexico City"));
		countryRepository.save(new Country("Singapore","Singapore City"));
		countryRepository.save(new Country("China","Beijing"));
		countryRepository.save(new Country("South Korea","Seul"));
	}

}
