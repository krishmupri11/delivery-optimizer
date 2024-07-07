package com.delivery.optimizer.strategy;

public interface DistanceCalculationsStrategy {
    double calculateDistance(double lat1, double lon1, double lat2, double lon2);
}
