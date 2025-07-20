package org.example;

import org.example.Parking.ParkingSpot;
import org.example.Vehicle.Vehicle;
import org.example.priceStratigy.PriceStrategy;

public class Ticket {
    String m_stId;
    Vehicle m_vehicle;
    long inTime;
    long outTime;
    PriceStrategy priceStrategy;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, PriceStrategy priceStrategy, ParkingSpot parkingSpot) {
        this.m_vehicle = vehicle;
        this.priceStrategy = priceStrategy;
        this.parkingSpot = parkingSpot;
        this.inTime = System.currentTimeMillis();
    }

    int getPrice(long timeElapsed){
        return priceStrategy.calculatePrice(m_vehicle,timeElapsed);
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }


}
