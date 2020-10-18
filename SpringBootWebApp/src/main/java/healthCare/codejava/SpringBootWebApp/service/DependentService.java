package healthCare.codejava.SpringBootWebApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healthCare.codejava.SpringBootWebApp.entity.EmpDependent1;
import healthCare.codejava.SpringBootWebApp.entity.Enrollee;
import healthCare.codejava.SpringBootWebApp.repository.DependentRepository;
import healthCare.codejava.SpringBootWebApp.repository.EnrolleeRepository;

@Service
public class DependentService {
	
	@Autowired
    private DependentRepository depRepo;
	
	public String addDep(EmpDependent1 e) {
		depRepo.save(e);
		return "Success!!";
	}
	
	public String deleteDep(Integer id) {
		depRepo.deleteById(id);
		return "Success!!";
	}
	
	public String updateDep(EmpDependent1 e) {
		EmpDependent1 updated = new EmpDependent1();
		if(e.getId() != null) {
			System.out.println("input not null");
			Optional<EmpDependent1> existing = depRepo.findById(e.getId());
			if(existing != null) {
				updated = existing.get();
				updated.setBday(e.getBday());
				updated.setUsername(e.getUsername());
				updated.setEnrolleeId(e.getEnrolleeId());
				depRepo.save(updated);
			}
			
		}
		return "Success!!";
	}

}
