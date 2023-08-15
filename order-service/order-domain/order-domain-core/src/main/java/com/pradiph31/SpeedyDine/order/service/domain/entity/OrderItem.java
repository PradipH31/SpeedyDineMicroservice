package com.pradiph31.SpeedyDine.order.service.domain.entity;

import com.pradiph31.SpeedyDine.domain.entity.BaseEntity;
import com.pradiph31.SpeedyDine.domain.valueobject.Money;
import com.pradiph31.SpeedyDine.domain.valueobject.OrderId;
import com.pradiph31.SpeedyDine.order.service.domain.valueobject.OrderItemId;

public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId orderId;
    private final Product product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    boolean isPriceValid() {
        return price.isGreaterThanZero() && price.equals(product.getPrice()) && price.multiply(quantity).equals(subTotal);
    }

    private OrderItem(Builder builder) {
        super.setId(builder.orderItemId);
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    void initializeOrderItem(OrderId orderId, OrderItemId orderItemId) {
        this.orderId = orderId;
        super.setId(orderItemId);
    }

    public static final class Builder {
        private OrderItemId orderItemId;
        private Product product;
        private int quantity;
        private Money price;
        private Money subTotal;

        private Builder() {
        }

        public static Builder anOrderItem() {
            return new Builder();
        }

        public Builder orderItemId(OrderItemId orderItemId) {
            this.orderItemId = orderItemId;
            return this;
        }

        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(Money price) {
            this.price = price;
            return this;
        }

        public Builder subTotal(Money subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
