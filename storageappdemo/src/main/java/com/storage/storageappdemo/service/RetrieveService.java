package com.storage.storageappdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storage.storageappdemo.model.Employee;
import com.storage.storageappdemo.repo.DataRepository;

@Service
public class RetrieveService {
	
	@Autowired
	DataRepository dataRepository;
	
	public List<Employee> getAllEmployee() {
        return dataRepository.findAll();
    }

}
