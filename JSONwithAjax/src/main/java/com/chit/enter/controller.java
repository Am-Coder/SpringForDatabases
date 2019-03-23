package com.chit.enter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chit.enter.entity.Student;
import com.chit.enter.repo.StudentRepo;

@Controller
public class controller {
	
	@Autowired
	StudentRepo studRepo;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home1() {
		return "home1";
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/find")
	@ResponseBody	//Converts output response to json,else returned string is treated as a view
	public  Student good(@RequestParam("rollno") String rollno) {
		Optional<Student> studPres = studRepo.findById(rollno);
		if(studPres.isPresent()) {
			System.out.println(rollno);

			return studPres.get();
		}
		else
			return null;
	}
}
