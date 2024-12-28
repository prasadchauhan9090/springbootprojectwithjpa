package com.chauhan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhan.springboot.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
