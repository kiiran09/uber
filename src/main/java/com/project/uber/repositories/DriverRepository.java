package com.project.uber.repositories;

import com.project.uber.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Long, Driver> {
}
