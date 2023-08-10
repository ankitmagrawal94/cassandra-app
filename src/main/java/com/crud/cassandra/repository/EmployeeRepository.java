package com.crud.cassandra.repository;

import com.crud.cassandra.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {
}
