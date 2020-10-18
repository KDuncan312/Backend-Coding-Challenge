package healthCare.codejava.SpringBootWebApp.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.GenerationType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Enrollee {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = false, nullable = false)
	private String username;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(unique = false, nullable = false)
	private Date bday;
	
	@Column(unique = false, nullable = false)
	private Boolean activation ;
	
	@Column(unique = false, nullable = true)
	private String phone;
	
	//ArrayList<EmpDependent1> dependents;
	
	
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
	public Boolean getActivation() {
		return activation;
	}
	public void setActivation(Boolean activation) {
		this.activation = activation;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}

	
	
	
}
