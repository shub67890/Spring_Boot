package edu.coffeeProd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.coffeeProductioon.entity.Coffee;


@RestController

public class coffeeHouse 

{
     // creating list of coffee
	private List<Coffee> coffee = new ArrayList<>();

	public coffeeHouse() 
	{
		coffee.addAll(List.of
                                       (new Coffee(550, "Latte"),
                                       new Coffee(250, "Macchiato"),
                                       new Coffee(300, "Cortado"),
                                       new Coffee(300, "Flat White"),
                                       new Coffee(450, "Americano"),
                                       new Coffee(350, "Instant Coffee"),
                                       ));
		
	}
	
      // Mapping
	@RequestMapping(value = "/coffee", method = RequestMethod.GET)

	Iterable<Coffee> getAllLeds()
	{
		return coffee;
	}

}
