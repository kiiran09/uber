package com.project.uber.repositories;

import com.project.uber.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRequestRepository extends JpaRepository<Long, RideRequest> {
}
