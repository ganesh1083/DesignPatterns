package org.example.Parking;

import org.example.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    List<ParkingSpot> m_spots;
    ParkingFloor(){
        m_spots = new ArrayList<>();
    }
    public void addParkingSpot(ParkingSpot spot){
        m_spots.add(spot);
    }

    public int getAvailableCount(){
        return (int) m_spots.stream().filter(ParkingSpot::isAvailable).count();
    }

    public ParkingSpot getSpot(Vehicle vehicle){
        ParkingSpot spot= m_spots.stream().filter(x->x.canFit(vehicle)).findFirst().orElse(null);
        if(spot != null){
            spot.setAvailable(false);
        }
        return spot;
    }
}
