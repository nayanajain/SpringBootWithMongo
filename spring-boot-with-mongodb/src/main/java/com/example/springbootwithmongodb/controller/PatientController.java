package com.example.springbootwithmongodb.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwithmongodb.model.MyResponse;
import com.example.springbootwithmongodb.model.Patients;
import com.example.springbootwithmongodb.service.PatientService;

import jakarta.validation.Valid;

@RestController
public class PatientController {
	@Autowired
	private PatientService patientService;
	@Autowired
	MyResponse response;
	
	@PostMapping(value = "/add")
	public MyResponse postPatientData(@RequestBody @Valid Patients patients, BindingResult result) throws Exception
	{
		
		if(result.hasErrors())
		{
			String error = result.getAllErrors().get(0).getDefaultMessage();
		
				
				response.setMessage("Validation Error" + error);
				return response;
		}
		
		
		response = patientService.save(patients);
		//response.setMessage("Data added to db");
		return response;
		
		
		
	}
	
	@GetMapping(value = "/view")
	public List<Patients> viewPatientData()
	{
		List<Patients> patients = patientService.viewAllPatients();
		return patients;
		
		
	}
	
	@PutMapping(value = "/update")
	public MyResponse modifyPatientData(@RequestBody @Valid Patients patients, BindingResult result) throws Exception
	{
		MyResponse response = new MyResponse();
		System.out.print(result.hasErrors());
		if(result.hasErrors())
		{
			String error = result.getAllErrors().get(0).getDefaultMessage();
		
				
				response.setMessage("Validation Error" + error);
				return response;
		}
		
		
		response = patientService.save(patients);
		//response.setMessage("Data added to db");
		return response;
		
		
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public MyResponse deletePatientData(@PathVariable("id") int id)
	{
		response = patientService.deletePatients(id);
		return response;
		
		
	}

}
