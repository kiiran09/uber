package com.project.uber.services;

import org.springframework.data.geo.Point;

public interface DistanceService {
    double calculateDistance(Point source, Point destination);
}
