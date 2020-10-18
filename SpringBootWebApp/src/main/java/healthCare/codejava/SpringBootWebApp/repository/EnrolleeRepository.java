package healthCare.codejava.SpringBootWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import healthCare.codejava.SpringBootWebApp.entity.Enrollee;

@Repository
public interface EnrolleeRepository extends JpaRepository<Enrollee, Integer>{

}
