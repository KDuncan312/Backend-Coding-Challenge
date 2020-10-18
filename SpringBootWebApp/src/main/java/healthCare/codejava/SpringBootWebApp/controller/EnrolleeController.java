package healthCare.codejava.SpringBootWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import healthCare.codejava.SpringBootWebApp.entity.Enrollee;
import healthCare.codejava.SpringBootWebApp.repository.EnrolleeRepository;
import healthCare.codejava.SpringBootWebApp.service.EnrolleeService;


@RestController
public class EnrolleeController {
	
	@Autowired
    private EnrolleeService enrolleeService;
	
	@PostMapping("/add")
	public String addEnrollee(@RequestBody Enrollee e) {
		//System.out.println(e.getUsername());
		//System.out.println(e.getPhone());
		//System.out.println(e.getBday());
		enrolleeService.addEnrollee(e);
		return "Success";
	}
	
	@PostMapping("/update")
	public String updateEnrollee(@RequestBody Enrollee e) {
		//System.out.println(e.getUsername());
		//System.out.println(e.getPhone());
		//System.out.println(e.getBday());
		enrolleeService.updateEnrollee(e);
		return "Success";
	}
	
	@PostMapping("/delete")
	public String deleteEnrollee(@RequestBody Integer e) {
		
		enrolleeService.deleteEnrollee(e);
		return "Success!!";
	}
	
	//@GetMapping("/get")
	//public List<Enrollee> getEnrollee() {
		
		//return (List<Enrollee>) enrolleeService.findAll();
	//}

}
