package com.example.springbootwithmongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootwithmongodb.model.Patients;

public interface PatientsRepo extends MongoRepository<Patients, String> {

	Patients findById(int id);

	Patients findByName(String name);

	Patients findByEmail(String name);


}
