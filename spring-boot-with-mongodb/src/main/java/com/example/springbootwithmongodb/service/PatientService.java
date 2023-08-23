package com.example.springbootwithmongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootwithmongodb.model.MyResponse;
import com.example.springbootwithmongodb.model.Patients;
import com.example.springbootwithmongodb.repo.PatientsRepo;

@Service
public class PatientService {
	
	@Autowired
	private PatientsRepo patientsRepo;
	@Autowired
	MyResponse response;
	
	public MyResponse save(Patients patients)
	{
		
		Patients p2 = patientsRepo.findByName(patients.getName());
		Patients p3 = patientsRepo.findByEmail(patients.getEmail());
		if(p2 ==null && p3 ==null)
		{
		
		 patientsRepo.save(patients);
		 response.setMessage("data saved successfully");
		}
		else if(p2!=null) {
			 response.setMessage("data can not be savesd successfully as patient name already exists");
		}
		else {
			 response.setMessage("data can not be savesd successfully as patient email already exists");
		}
		return response;
		 
	}
	
	public List<Patients> viewAllPatients()
	{
		return patientsRepo.findAll();
	}
	
	public MyResponse deletePatients(int id)
	{
		Patients patients = patientsRepo.findById(id);
		if(patients ==null)
		{
			response.setMessage("id not available");
			return response;
		}
		else {
		patientsRepo.delete(patients);
		response.setMessage("data is successfully deleted");
		return response;
		
		}
	}

}
