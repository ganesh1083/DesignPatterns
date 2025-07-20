package org.example.Parking;

public class SpotProducer {

    public static ParkingSpot makeSpot(SpotType type){
        switch (type){
            case BIKE -> {
                return new BikeSpot();
            }
            case COMPACT -> {
                return new CompactSpot();
            }
            case LARGE -> {
                return new LargeSpot();
            }
            default -> {
                throw new RuntimeException();
            }
        }
    }
}
