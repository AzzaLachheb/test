package com.test.demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	static final String CONST = "response";
	@GetMapping(value = "/test", 
    produces = MediaType.APPLICATION_JSON_VALUE)
	public Map greeting(@RequestParam(value = "nbr", defaultValue = "1") int nbr) {
		if ((nbr % 3 == 0) && (nbr % 5 == 0))
			return Collections.singletonMap(CONST,"FizzBuzz");
		else if (nbr % 5 == 0)
			return Collections.singletonMap(CONST,"Buzz");
		else if (nbr % 3 == 0)
			return Collections.singletonMap(CONST,"Fizz");
		else
			return Collections.singletonMap(CONST,nbr + 1 + "");
	}
}