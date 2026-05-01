package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
@Slf4j
@RequiredArgsConstructor
class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderTrackCommandHandler orderTrackCommandHandler;
    private final OrderCreateCommandHandler orderCreateCommandHandler;

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand orderCommand) {
        return orderCreateCommandHandler.createOrder(orderCommand);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackOrderQuery orderQuery) {
        return orderTrackCommandHandler.trackOrder(orderQuery);
    }
}
