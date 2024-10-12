package com.project.uber.services.impl;

import com.project.uber.services.DistanceService;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point source, Point destination) {
        return 0;
    }
}
