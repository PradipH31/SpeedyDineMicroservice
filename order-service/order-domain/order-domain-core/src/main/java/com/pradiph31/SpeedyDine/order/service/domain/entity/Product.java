package com.pradiph31.SpeedyDine.order.service.domain.entity;

import com.pradiph31.SpeedyDine.domain.entity.BaseEntity;
import com.pradiph31.SpeedyDine.domain.valueobject.Money;
import com.pradiph31.SpeedyDine.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
