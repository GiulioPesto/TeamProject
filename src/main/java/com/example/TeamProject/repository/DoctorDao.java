package com.example.TeamProject.repository;

import com.example.TeamProject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {
}
