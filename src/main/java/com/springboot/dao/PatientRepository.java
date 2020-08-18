package com.springboot.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	public Optional<Patient> findByUsernameAndPassword(String username, String password);
}
