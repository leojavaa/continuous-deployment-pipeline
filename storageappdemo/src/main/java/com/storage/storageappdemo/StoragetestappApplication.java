package com.storage.storageappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StoragetestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoragetestappApplication.class, args);
	}

}
