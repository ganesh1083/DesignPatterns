package org.example.Parking;

import org.example.Vehicle.Vehicle;

public class CompactSpot extends ParkingSpot {
    public static final float DEFAULT_AREA = 20;

    public CompactSpot(int id, float area) {
        m_id = id;
        m_spotType = SpotType.COMPACT;
        m_area = area;
    }

    public CompactSpot() {
        this(ParkingSpot.getNextID(), DEFAULT_AREA);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getArea() <= m_area;
    }
}