package com.example.javaguide.springbackendhosp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.javaguide.springbackendhosp.model.doctor;


@Repository
public interface doctorRepository extends JpaRepository<doctor,Long>{

	@Query("SELECT DISTINCT a.name FROM doctor a")
    List<String> findAllDoctor();
	
	
	@Query("SELECT a.name, a.Specialised ,a.age,a.gender from doctor a where a.name=?1")
	List<String> findbydoctorName(String name);
	
	@Query("select a.name,count(b.id) from doctor a,patient b where a.name=b.VisitedDoctorName group by a.name")
	List<String> findPatientNumber();
	
	 
	
	
	
	
}
