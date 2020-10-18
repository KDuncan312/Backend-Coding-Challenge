package healthCare.codejava.SpringBootWebApp.dto;

import java.sql.Date;
import java.util.ArrayList;

import healthCare.codejava.SpringBootWebApp.entity.EmpDependent1;

public class EnroleeDTO {
	
	private Integer id;
	private String username;
	private Date bday;
	private Boolean activation ;
	private String phone;
	ArrayList<EmpDependent1> dependents;
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
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
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
	public ArrayList<EmpDependent1> getDependents() {
		return dependents;
	}
	public void setDependents(ArrayList<EmpDependent1> dependents) {
		this.dependents = dependents;
	}
	
	

}
