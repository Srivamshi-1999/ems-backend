package com.dunizer.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dunizer.ems_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
