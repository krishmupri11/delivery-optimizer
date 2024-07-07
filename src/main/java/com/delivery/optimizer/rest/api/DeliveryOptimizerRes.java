package com.delivery.optimizer.rest.api;

import com.delivery.optimizer.rest.request.OptimalRouteRequest;
import com.delivery.optimizer.rest.response.OptimalRouteResponse;
import com.delivery.optimizer.service.DeliveryOptimizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeliveryOptimizerRes {
    @Autowired
    DeliveryOptimizerService deliveryOptimizerService;

    @GetMapping("/optimal-route")
    public OptimalRouteResponse getOptimalRoute(@RequestBody OptimalRouteRequest request){
        return deliveryOptimizerService.getOptimalRoute(request);
    }

}
