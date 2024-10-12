package com.project.uber.repositories;

import com.project.uber.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Long, Ride> {
}
