package com.example.TeamProject.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
// TODO controllare @OneToMany e @ManyToOne nelle relative entity
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "time", nullable = false)
    private Timestamp time;
    @Column(name = "medical_office")
    private String medicalOffice;
    @Column(name = "reason")
    private String reason;
    /*@ManyToOne
    private PatientEntity patient;
    @ManyToOne
    private SecretaryEntity secretary;*/

    public BookingEntity(){}

    public BookingEntity(Timestamp time, String medicalOffice, String reason) {
        this.time = time;
        this.medicalOffice = medicalOffice;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getMedicalOffice() {
        return medicalOffice;
    }

    public void setMedicalOffice(String medicalOffice) {
        this.medicalOffice = medicalOffice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}