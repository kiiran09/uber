package com.project.uber.repositories;

import com.project.uber.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Long, Rider> {
}
