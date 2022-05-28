package com.example.javaguide.springbackendhosp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javaguide.springbackendhosp.model.patient;


@Repository
public interface patientRepository extends JpaRepository<patient ,Long> {

}
