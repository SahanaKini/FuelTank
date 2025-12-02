package com.roadrescue.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "service_providers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProvider {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stationName;
    private String inchargeName;
    private String phone;
    private String email;
    private String address;
    private boolean fuelAvailable;
    private boolean towAvailable;
    private boolean tireAvailable;
    private double chargePerKm;
}
