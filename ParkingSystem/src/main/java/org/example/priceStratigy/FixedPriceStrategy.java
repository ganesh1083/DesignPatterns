package org.example.priceStratigy;

import org.example.Vehicle.Vehicle;

public class FixedPriceStrategy implements PriceStrategy{
    @Override
    public int calculatePrice(Vehicle vehicle, long time) {
        return (int) (time*20);
    }
}
