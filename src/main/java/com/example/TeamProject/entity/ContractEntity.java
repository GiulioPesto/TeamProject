package com.example.TeamProject.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract_entity")
public class ContractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "salary")
    private Double salary;
    /*@ManyToOne
    private MedicalOfficeEntity medicalOffice;
    @ManyToOne
    private DoctorEntity doctor;
    @ManyToOne
    private SecretaryEntity secretary;*/

    public ContractEntity() {}

    public ContractEntity(Date startDate, Date endDate, Double salary) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}