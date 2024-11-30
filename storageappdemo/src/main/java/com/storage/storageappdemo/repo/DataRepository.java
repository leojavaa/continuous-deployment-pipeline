package com.storage.storageappdemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.storage.storageappdemo.model.Employee;

public interface DataRepository extends MongoRepository<Employee,String> {


}
