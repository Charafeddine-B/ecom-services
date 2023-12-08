package org.sid.orderservice.entities;

import org.sid.orderservice.enums.OrderStatus;
import org.sid.orderservice.model.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullOrder",types = Order.class)
public interface OrderProjection {
     Long getId();
     String getCreatedAt();
     Long getCustomerId();
     OrderStatus getStatus();
}
