package com.example.javaguide.springbackendhosp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name = "Patient")
public class patient {

	
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name = "pId")
	private Long id;
	
	 @Column(name="pName")
	private String name;
	
	 @Column(name="DateOfVisit")
	private String dateOfVisit;
	
	 
	 @Column(name="VisitedDoctorName")  

	private String VisitedDoctorName;

	public patient(String name, String dateOfVisit, String visitedDoctorName) {
		super();
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		VisitedDoctorName = visitedDoctorName;
	}
	public patient()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getVisitedDoctorName() {
		return VisitedDoctorName;
	}
	public void setVisitedDoctorName(String visitedDoctorName) {
		VisitedDoctorName = visitedDoctorName;
	}
	
	
	
	
	
	
	
	
	
}
