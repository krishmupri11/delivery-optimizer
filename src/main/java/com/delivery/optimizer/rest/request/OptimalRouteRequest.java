package com.delivery.optimizer.rest.request;

import com.delivery.optimizer.model.Customer;
import com.delivery.optimizer.model.Location;
import com.delivery.optimizer.model.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;


@AllArgsConstructor
@Data
public class OptimalRouteRequest {
    private Location deliveryPersonLocation;
    private List<Restaurant> restaurantList;
    private List<Customer> customerList;
}
