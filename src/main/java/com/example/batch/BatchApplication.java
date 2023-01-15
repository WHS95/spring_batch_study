package com.example.batch;


import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.batch.scheduler.testScheduler;


@EnableBatchProcessing
@SpringBootApplication
public class BatchApplication {

	@SuppressWarnings("unused")
	@Autowired
	private testScheduler scheduler;

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}
}