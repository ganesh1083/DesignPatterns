package org.example.priceStratigy;

import org.example.Vehicle.Vehicle;

public interface PriceStrategy {

    public int calculatePrice(Vehicle vehicle, long time);
}
