package org.example;

import org.example.Parking.ParkingFloor;
import org.example.Parking.ParkingSpot;
import org.example.Vehicle.Vehicle;
import org.example.priceStratigy.FixedPriceStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ParkingManager {
    static List<ParkingFloor> m_floor;
    static Map<String,Ticket> mapTicket= new HashMap<>();
    public synchronized Ticket getSpotForParking(Vehicle vehicle){
        ParkingSpot spot = m_floor.stream().map(x -> x.getSpot(vehicle)).filter(Objects::nonNull).filter(s -> s.isAvailable()).filter(s -> s.canFit(vehicle)).findFirst().orElse(null);

        if(spot == null){
            throw new RuntimeException("Unable to find space for "+ vehicle.getNumberPlate());
        }
        Ticket ticket = new Ticket(vehicle,new FixedPriceStrategy(),spot);
        spot.setAvailable(false);
        mapTicket.put(vehicle.getNumberPlate(), ticket);
        return ticket;
    }

    public synchronized long unPark(Vehicle vehicle){
        Ticket ticket = mapTicket.get(vehicle.getNumberPlate());
        mapTicket.remove(vehicle.getNumberPlate());
        ticket.getParkingSpot().setAvailable(true);
        return ticket.getPrice(ticket.inTime);
    }

    public int getFreeSpotCount(){
        return m_floor.stream().mapToInt(x->x.getAvailableCount()).sum();
    }
}
