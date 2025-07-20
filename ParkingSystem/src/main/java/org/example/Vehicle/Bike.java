package org.example.Vehicle;

public class Bike extends Vehicle {

    public static final float DEFAULT_AREA = 10;
    public Bike(String stNumberPlate){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.BIKE;
        m_area = DEFAULT_AREA;
    }
    public Bike(String stNumberPlate, float area){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.BIKE;
        m_area = area;
    }
    @Override
    public float getArea() {
        return m_area;
    }
}
