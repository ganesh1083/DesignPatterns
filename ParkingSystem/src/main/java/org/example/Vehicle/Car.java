package org.example.Vehicle;

public class Car extends Vehicle{

    public static final float DEFAULT_AREA = 20;
    public Car(String stNumberPlate){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.CAR;
        m_area = DEFAULT_AREA;
    }
    public Car(String stNumberPlate, float area){
        m_stNumberPlate = stNumberPlate;
        m_type = VehicleType.BIKE;
        m_area = area;
    }
    @Override
    public float getArea() {
        return m_area;
    }
}
