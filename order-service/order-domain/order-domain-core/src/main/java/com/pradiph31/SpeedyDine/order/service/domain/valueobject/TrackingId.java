package com.pradiph31.SpeedyDine.order.service.domain.valueobject;

import com.pradiph31.SpeedyDine.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}
