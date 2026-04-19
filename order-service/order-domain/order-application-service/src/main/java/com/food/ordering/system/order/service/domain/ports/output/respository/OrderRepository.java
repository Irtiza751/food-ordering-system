package com.food.ordering.system.order.service.domain.ports.output.respository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.valu.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);
    Optional<Order> findByTrackingId(TrackingId trackingId);
}
