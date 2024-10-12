package com.project.uber.dto;

import com.project.uber.entities.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {

    private User user;
    private double rating;
    private boolean available;
    private Point currentLocation;
}
