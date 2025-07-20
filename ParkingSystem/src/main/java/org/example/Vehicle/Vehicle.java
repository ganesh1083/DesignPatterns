package org.example.Vehicle;

public abstract class Vehicle {
    public String getNumberPlate() {
        return m_stNumberPlate;
    }

    public VehicleType getType() {
        return m_type;
    }

    String m_stNumberPlate;
    VehicleType m_type;
    float m_area;
    public abstract float getArea();

}
