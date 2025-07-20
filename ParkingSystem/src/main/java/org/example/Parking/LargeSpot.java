package org.example.Parking;

import org.example.Vehicle.Vehicle;

public class LargeSpot extends ParkingSpot {
    public static final float DEFAULT_AREA = 30;

    public LargeSpot(int id, float area) {
        m_id = id;
        m_spotType = SpotType.COMPACT;
        m_area = area;
    }

    public LargeSpot() {
        this(ParkingSpot.getNextID(), DEFAULT_AREA);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getArea() <= m_area;
    }
}