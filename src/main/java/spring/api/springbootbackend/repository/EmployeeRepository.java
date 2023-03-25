package spring.api.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD database methods
}
