package com.rushi.EmployerManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rushi.EmployerManagement.Model.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, String> {

}
