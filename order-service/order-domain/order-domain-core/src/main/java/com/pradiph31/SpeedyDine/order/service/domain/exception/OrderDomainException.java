package com.pradiph31.SpeedyDine.order.service.domain.exception;

import com.pradiph31.SpeedyDine.domain.exception.DomainException;

public class OrderDomainException extends DomainException {
    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
