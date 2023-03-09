package com.constinj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constinj.entity.Trainer;


@RestController
//RestController annotation is used to create RESTful web services using Spring MVC

public class TrainerController {

	private Trainer trainer;

	public TrainerController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	// It use for mapped the data
	@GetMapping("/teach")
	public String teach()
	{
		trainer.teach();
		
		return "Training completed sucessfully!";
	}

}
