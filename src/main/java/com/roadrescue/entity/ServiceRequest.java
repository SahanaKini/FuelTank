package com.roadrescue.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "service_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userEmail;
    private String type; // FUEL, TOW, TIRE
    private String status; // PENDING, ASSIGNED, COMPLETED
    private double latitude;
    private double longitude;
    private LocalDateTime createdAt;
}
