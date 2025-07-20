package org.example.Vehicle;

public class Truck extends Vehicle{

    public static final float DEFAULT_AREA = 30;
    public Truck(String stNumberPlate){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.TRUCK;
        m_area = DEFAULT_AREA;
    }
    public Truck(String stNumberPlate, float area){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.BIKE;
        m_area = area;
    }
    @Override
    public float getArea() {
        return m_area;
    }
}