package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/mark")
public class Marks {

	@GetMapping("/map")
	public String stdMarks() {
		return "StudentMarks";
	}

}
