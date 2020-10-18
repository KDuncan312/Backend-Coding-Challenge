package healthCare.codejava.SpringBootWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import healthCare.codejava.SpringBootWebApp.entity.EmpDependent1;
import healthCare.codejava.SpringBootWebApp.entity.Enrollee;
import healthCare.codejava.SpringBootWebApp.service.DependentService;
import healthCare.codejava.SpringBootWebApp.service.EnrolleeService;

@RestController
public class DependentController {
	
	@Autowired
    private DependentService depService;
	
	@PostMapping("/depadd")
	public String addEnrollee(@RequestBody EmpDependent1 e) {
		depService.addDep(e);
		return "Success";
	}
	
	@PostMapping("/depupdate")
	public String updateEnrollee(@RequestBody EmpDependent1 e) {
		//System.out.println(e.getUsername());
		//System.out.println(e.getBday());
		depService.updateDep(e);
		return "Success";
	}
	
	@PostMapping("/depdelete")
	public String deleteEnrollee(@RequestBody Integer e) {
		
		depService.deleteDep(e);
		return "Success!!";
	}

}
