package com.delivery.optimizer.rest.request;

import com.delivery.optimizer.model.Customer;
import com.delivery.optimizer.model.Location;
import com.delivery.optimizer.model.Restaurant;

import java.util.List;

public class DriverRequest {
    private Location driver;
    private List<Restaurant> restuarants;
    private List<Customer> customers;
}
