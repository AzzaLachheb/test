package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String greeting(@RequestParam(value = "nbr", defaultValue = "1") int nbr) {
		if ((nbr % 3 == 0) && (nbr % 5 == 0))
			return "FizzBuzz";
		else if (nbr % 5 == 0)
			return "Buzz";
		else if (nbr % 3 == 0)
			return "Fizz";
		else
			return nbr + 1 + "";
	}
}