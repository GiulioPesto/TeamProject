package com.example.TeamProject.repository;

import com.example.TeamProject.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDao extends JpaRepository<Booking,Long> {

}
