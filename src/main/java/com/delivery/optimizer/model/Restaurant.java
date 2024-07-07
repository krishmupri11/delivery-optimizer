package com.delivery.optimizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Restaurant {
    private Location location;
    private double preparationTime;
}
