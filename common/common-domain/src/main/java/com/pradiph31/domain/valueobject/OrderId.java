package com.pradiph31.domain.valueobject;

import java.util.UUID;

public class OrderId  extends BaseId<UUID> {
    protected OrderId(UUID value) {
        super(value);
    }
}
