package org.gurukul.em_project.repository;

import org.gurukul.em_project.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity , Long>{
    //custom methods implementation !
}
