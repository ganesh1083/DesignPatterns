package org.example.Parking;

import org.example.Vehicle.Vehicle;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ParkingSpot {
    static AtomicInteger counter = new AtomicInteger(0);
    int m_id;
    SpotType m_spotType;
    float m_area;
    boolean fAvailable;

    public abstract boolean canFit(Vehicle vehicle);

    public static int getNextID(){
        return counter.addAndGet(1);
    }

    public boolean isAvailable() {
        return fAvailable;
    }

    public void setAvailable(boolean fAvailable) {
        this.fAvailable = fAvailable;
    }
}
