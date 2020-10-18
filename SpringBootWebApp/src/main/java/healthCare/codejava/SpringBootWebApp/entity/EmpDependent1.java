package healthCare.codejava.SpringBootWebApp.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EmpDependent1 {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = false, nullable = false)
	private String username;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(unique = false, nullable = false)
	private Date bday;
	
	@Column(unique = false, nullable = true)
	private Integer enrolleeId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Integer getEnrolleeId() {
		return enrolleeId;
	}
	public void setEnrolleeId(Integer enrolleeId) {
		this.enrolleeId = enrolleeId;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	
	

}
