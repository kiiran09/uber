package com.project.uber.dto;

import com.project.uber.entities.Driver;
import com.project.uber.entities.Rider;
import com.project.uber.entities.enums.PaymentMethod;
import com.project.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.geo.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private Rider rider;

    private Driver driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
