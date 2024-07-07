package com.delivery.optimizer.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class OptimalRouteResponse {
    private double time;
    private List<String> path;
}
