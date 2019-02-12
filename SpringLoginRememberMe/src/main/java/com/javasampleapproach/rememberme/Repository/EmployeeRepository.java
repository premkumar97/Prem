package com.javasampleapproach.rememberme.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.rememberme.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
