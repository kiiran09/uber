package com.project.uber.strategies.impl;

import com.project.uber.dto.RideRequestDto;
import com.project.uber.entities.Driver;
import com.project.uber.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
