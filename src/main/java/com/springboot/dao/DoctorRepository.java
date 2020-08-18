package com.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	public Optional<Doctor> findByUsernameAndPassword(String username, String password);

	public List<Doctor> findByNameOrAddress_CityOrSpeciality(String name, String city, String speciality);
}
