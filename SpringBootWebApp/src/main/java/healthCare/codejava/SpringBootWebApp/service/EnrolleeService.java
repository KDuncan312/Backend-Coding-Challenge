package healthCare.codejava.SpringBootWebApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import healthCare.codejava.SpringBootWebApp.entity.EmpDependent1;
import healthCare.codejava.SpringBootWebApp.entity.Enrollee;
import healthCare.codejava.SpringBootWebApp.repository.DependentRepository;
import healthCare.codejava.SpringBootWebApp.repository.EnrolleeRepository;

@Service
public class EnrolleeService {
	
	@Autowired
    private EnrolleeRepository enrolleeRepo;
	
	@Autowired
    private DependentRepository depRepo;
	
	public String addEnrollee(Enrollee e) {
		enrolleeRepo.save(e);
		return "Success!!";
	}
	
	public String updateEnrollee(Enrollee e) {
		Enrollee updated = new Enrollee();
		if(e.getId() != null) {
			System.out.println("input not null");
			Optional<Enrollee> existing = enrolleeRepo.findById(e.getId());
			if(existing != null) {
				updated = existing.get();
				updated.setActivation(e.getActivation());
				updated.setPhone(e.getPhone());
				updated.setBday(e.getBday());
				updated.setUsername(e.getUsername());
				enrolleeRepo.save(updated);
			}
			
		}
		return "Success!!";
	}
	
	public String deleteEnrollee(Integer id) {
		List<EmpDependent1> dependents = depRepo.findAll();
		if(dependents != null) {
			for(EmpDependent1 dep : dependents) {
				if(dep.getEnrolleeId() == id) {
					dep.setEnrolleeId(null);
					depRepo.save(dep);
				}
				
			}
			
		}
		enrolleeRepo.deleteById(id);
		return "Success!!";
	}
	
	
}
