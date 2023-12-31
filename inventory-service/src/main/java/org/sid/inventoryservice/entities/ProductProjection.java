package org.sid.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProduct",types = Product.class)
public interface ProductProjection {
    public Long getId();
    public String getPrice();
    public String getName();
    public String getQuantity();
}
