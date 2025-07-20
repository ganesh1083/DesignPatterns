package org.example.Parking;

import org.example.Vehicle.Vehicle;

public class BikeSpot extends ParkingSpot {
    public static final float DEFAULT_AREA = 10;

    public BikeSpot(int id, float area) {
        m_id = id;
        m_spotType = SpotType.BIKE;
        m_area = area;
    }

    public BikeSpot() {
        this(ParkingSpot.getNextID(), DEFAULT_AREA);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getArea() <= m_area;
    }
}
