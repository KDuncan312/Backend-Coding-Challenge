package healthCare.codejava.SpringBootWebApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import healthCare.codejava.SpringBootWebApp.entity.EmpDependent1;

public interface DependentRepository extends JpaRepository<EmpDependent1, Integer>{
	
	//@Query("FROM emp_dependent1 c WHERE c.enrollee_id = :id")
	//List<EmpDependent1> findByempId(@Param("id") Integer id);
	
	//@Query("FROM enrollee b inner join emp_dependent1 a on b.id=a.enrollee_id")
	//List<EmpDependent1> retuenEnroll(@Param("id") Integer id);

}
